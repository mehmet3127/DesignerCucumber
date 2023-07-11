package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DesignerPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class DesignerStepDefinition {


    DesignerPage designerPage = new DesignerPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 100);


    @Given("Kullanici designer sayfasina gider")
    public void kullaniciDesignerSayfasinaGider() {

        Driver.getDriver();

    }


    @Then("Kullanici gecerli username girer")
    public void kullanicigecerliUsernameGirer() {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("userName"));

    }

    @And("Kullanici gecerli password girer")
    public void kullanicigecerliPasswordGirer() {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanici login buttonuna tıklar")
    public void kullaniciLoginButtonunaTıklar() throws InterruptedException {
        designerPage.sistemeGiris.click();

        Thread.sleep(5000);
        String windows = Driver.getDriver().getWindowHandles().iterator().next();
        Driver.getDriver().switchTo().window(windows).getTitle();


    }


    @Then("Kullanici gecerli userName {string} girer")
    public void kullaniciGecerliUserNameGirer(String girilecekUserName) {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty(girilecekUserName));

    }

    @And("Kullanici gecerli olmayan password {string} girer")
    public void kullaniciGecerliOlmayanPasswordGirer(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));

    }

    @Then("Kullanici gecerli olmayan userName {string} girer")
    public void kullaniciGecerliOlmayanUserNameGirer(String girilecekUserName) {
        designerPage.kullaniciAdi.clear();
        designerPage.kullaniciAdi.sendKeys(ConfigReader.getProperty(girilecekUserName));

    }

    @And("kullanıcı gecerli password {string} girer")
    public void kullanıcıGecerliPasswordGirer(String girilecekPassword) {
        designerPage.sifre.clear();
        designerPage.sifre.sendKeys(ConfigReader.getProperty(girilecekPassword));
    }

    @Then("Kullanıcı tamam button'una tıklar")
    public void kullanıcıTamamButtonUnaTıklar() {

        designerPage.tamam.click();
    }


    @And("Kullanıcı Campaigns klasörüne tıklar")
    public void kullanıcıCampaignsKlasörüneTıklar() {

        wait.until(ExpectedConditions.elementToBeClickable(designerPage.campaigns));
        actions.doubleClick(designerPage.campaigns).perform();

    }

    @And("Kullanıcı mehmetDemir klasörüne sag tıklar")
    public void kullaniciMehmetDemirKlasorunesagTiklar() {

        actions.contextClick(designerPage.mehmetDemir).perform();
    }

    @And("Kullanıcı KampanyaEkle ye tıklar")
    public void kullaniciKampanyaEkleYeTiklar() {

        designerPage.kampanyaEkle.click();
    }

    @And("Kullanıcı Kampanya adı girer")
    public void kullanıcıKampanyaAdıGirer() {

        designerPage.kampanyaAdi.sendKeys("CucumberTest05");
    }

    @And("Kullanıcı kaydet butonuna tıklar")
    public void kullanıcıKaydetButonunaTıklar() {

        //designerPage.kampanyaKaydet.click();

    }

    @And("Kullanıcı kampanya modunu secer")
    public void kullanıcıKampanyaModunuSecer() {
        wait.until(ExpectedConditions.visibilityOf(designerPage.kampanyaDüzenleme));
        designerPage.kampanyaDüzenleme.click();
    }

    @And("Kullanıcı outbound secenegine tıklar")
    public void kullanıcıOutboundSecenegineTıklar() {
        wait.until(ExpectedConditions.visibilityOf(designerPage.outbound));
        designerPage.outbound.click();
    }

    @And("Kullanıcı varsayılan sonuç kodunu secer")
    public void kullanıcıVarsayılanSonuçKodunuSecer() {
        designerPage.varsayılanSonuçKoduSeç.click();
        actions.doubleClick(designerPage.çagrıCevaplanmadı).perform();
        designerPage.mesgul1071.click();
        designerPage.tamamSonuçKodu.click();
    }

    @Then("Kullanıcı Kaydet e tıklar")
    public void kullanıcıKaydetETıklar() {

        designerPage.kaydet.click();
    }

    @And("Kullanıcı mehmetDemir klasörüne tıklar")
    public void kullanıcıMehmetDemirKlasörüneTıklar() {

        actions.doubleClick(designerPage.mehmetDemir).perform();
    }

    @And("Kullanıcı istediği kampanyayı seçer")
    public void kullanıcıIstediğiKampanyayıSeçer() {

        actions.doubleClick(designerPage.cucumberTest01).perform();
    }

    @And("Kullanıcı AkışTasarım penceresine tıklar")
    public void kullanıcıAkışTasarımPenceresineTıklar() {
        wait.until(ExpectedConditions.elementToBeClickable(designerPage.akışTasarım));
        designerPage.akışTasarım.click();
    }

    @And("Kullanıcı formEkle butonuna tıklar")
    public void kullanıcıFormEkleButonunaTıklar() {
        designerPage.formEkle.click();
        //wait.until(ExpectedConditions.elementToBeClickable(designerPage.form1));
        //actions.doubleClick(designerPage.form1).perform();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //jse.executeScript("arguments[0].scrollIntoView(true);",designerPage.form1);

        jse.executeScript("arguments[0].click();",designerPage.form1);
    }
}
