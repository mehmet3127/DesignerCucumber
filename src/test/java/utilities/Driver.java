package utilities;
import io.appium.java_client.windows.WindowsDriver;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;



public class Driver {
    private Driver() {
        //SingletonPattern tekli kullanım demektir bu CLass dan başka obje oluşturulmasını engellemek için kullanılır

    }

    static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {

            DesiredCapabilities cap = new DesiredCapabilities();
            //cap.setCapability("app", ConfigReader.getProperty("designerPath"));
            //cap.setCapability("app", "C:\\Ucms\\Ucs.Ucms26.Designer 2.6.144.3\\Ucs.Ucms26.Designer.exe");
            cap.setCapability("app", "C:\\Ucms\\WDE - BaseModule\\InteractionWorkspace.exe");
            cap.setCapability("platformName", "Windows");
            cap.setCapability("deviceName", "WindowsPC");


            try {
                driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap) {
                };
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
              //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        }

        return driver;
    }

    @After
    public void afterClass() {
        //driver.quit();
    }
}
