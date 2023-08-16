package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WdePage;
import utilities.Driver;

import java.net.MalformedURLException;

public class WdeStepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 70);

    WdePage wdePage = new WdePage();


    @Given("Kullanici Wde sayfasina gider")
    public void kullaniciWdeSayfasinaGider()  {
        Driver.getDriver();
        String windows = Driver.getDriver().getWindowHandles().iterator().next();
        Driver.getDriver().switchTo().window(windows).getTitle();
        //wait.until(ExpectedConditions.elementToBeClickable(wdePage.login));
        //Driver.closeDriver();
    }

    @Then("Kullanıcı Wde için gecerli username girer")
    public void kullanıcıWdeIçinGecerliUsernameGirer() {
        //wdePage.userName.clear();
        //wdePage.userName.sendKeys("mehmet.demir");
    }

    @And("Kullanıcı Wde için gecerli password girer")
    public void kullanıcıWdeIçinGecerliPasswordGirer() {
        wdePage.password.clear();
        wdePage.password.sendKeys("x");
    }

    @And("Kullanici Wde login buttonuna tıklar")
    public void kullaniciWdeLoginButtonunaTıklar() throws InterruptedException {
        wdePage.login.click();
        Thread.sleep(5000);
        String windows = Driver.getDriver().getWindowHandles().iterator().next();
        Driver.getDriver().switchTo().window(windows).getTitle();
        Driver.closeDriver();
    }
}
