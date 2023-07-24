package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WdePage;
import utilities.Driver;


public class WdeStepDefinition {

    WdePage wdePage = new WdePage();

    @Given("Kullanici Wde sayfasina gider")
    public void kullaniciWdeSayfasinaGider() throws InterruptedException {

        Driver.getDriver();
        Thread.sleep(2000);

    }

    @Then("Kullanıcı Wde için gecerli username girer")
    public void kullanıcıWdeIçinGecerliUsernameGirer() {
        wdePage.userName.clear();
        wdePage.userName.sendKeys("mehmet.demir");

    }

    @And("Kullanıcı Wde için gecerli password girer")
    public void kullanıcıWdeIçinGecerliPasswordGirer() {
    }

    @And("Kullanici Wde login buttonuna tıklar")
    public void kullaniciWdeLoginButtonunaTıklar() {
    }
}
