package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    //Hook class ile test lerimiz de hata aldigimizda hata aldigimiz yerin resmini bize verir

    /*@Before
    public void setUp(Scenario scenario) {
        Driver.getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    }
    */


    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }

        //Driver.closeDriver();
   }
}
