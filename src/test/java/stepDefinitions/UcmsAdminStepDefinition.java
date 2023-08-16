package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UcmsAdminPage;
import utilities.Driver;


public class UcmsAdminStepDefinition {
    UcmsAdminPage ucmsAdminPage = new UcmsAdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    static String eklenenKodGrubuName;

    @Given("Kullanıcı ucmsadmin sayfasına gider")
    public void kullanıcıUcmsadminSayfasınaGider() {

        Driver.getDriver().get("http://pluton.ucsturkey.com:58027/login");
    }

    @When("kullanıcı ucmsadmin için geçerli username girer")
    public void kullanıcıUcmsadminIçinGeçerliUsernameGirer() {

        ucmsAdminPage.userName.sendKeys("mehmet.demir");
    }

    @And("kullanıcı ucmsadmin için geçerli password girer")
    public void kullanıcıUcmsadminIçinGeçerliPasswordGirer() {

        ucmsAdminPage.password.sendKeys("x");
    }

    @And("kullanıcı giriş butonuna tıklar")
    public void kullanıcıGirişButonunaTıklar() throws InterruptedException {
        ucmsAdminPage.girişButton.click();
        ucmsAdminPage.uygulamalar.click();
        ucmsAdminPage.ucmsConfig.click();
        ucmsAdminPage.girişButton.click();
    }

    @And("Sonuç kodları butonuna tıklar")
    public void sonuçKodlarıButonunaTıklar() {

        ucmsAdminPage.sonuçKodlarıButton.click();
    }

    @And("sonuş kodları sekmesine tıklar")
    public void sonuşKodlarıSekmesineTıklar() {

        ucmsAdminPage.sonuçKodlarSekmesi.click();
    }

    @And("kod grubu ekle ıkon a tıklar")
    public void kodGrubuEkleIkonATıklar() {

        ucmsAdminPage.kodGrubuEkleIkon.click();
    }

    @And("grup adı {string} ekler")
    public void grupAdıEkler(String grupAdı) {
        eklenenKodGrubuName = grupAdı;
        ucmsAdminPage.grupAdıEkle.sendKeys(eklenenKodGrubuName);


    }

    @And("grup adı  ekler")
    public void grupAdıEkler() {
    }

    @And("kaydet butonuna tıklar")
    public void kaydetButonunaTıklar() {

        ucmsAdminPage.kaydetButton.click();
    }

    @Then("onay butonuna tıklar")
    public void onayButonunaTıklar() {

        ucmsAdminPage.kaydetEvetButton.click();
    }

    @Then("sayfayı kapatır")
    public void sayfayıKapatır() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }


    @And("Eklenen kod grubunun sonuç kodu ekle ikonuna tıklar")
    public void eklenenKodGrubununSonuçKoduEkleIkonunaTıklar() {
        Driver.getDriver().navigate().refresh();
        WebElement eklenenkodGrubu = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + eklenenKodGrubuName + "')]"));
        actions.moveToElement(eklenenkodGrubu).perform();
        WebElement eklenenkodGrubuSonuçKoduEkle = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + eklenenKodGrubuName + "')]/following::button[@mattooltip='Sonuç Kodu Ekle']"));
        eklenenkodGrubuSonuçKoduEkle.click();

    }

    @And("Aksiyon tipi combo suna tıklanır")
    public void aksiyonTipiComboSunaTıklanır() {

        ucmsAdminPage.actionTipiCombo.click();
    }

    @And("acılan pencereden kaydı kapat sekmesine tıklar")
    public void acılanPenceredenKaydıKapatSekmesineTıklar() {

        ucmsAdminPage.kaydıKapat.click();
    }

    @And("başlık kısmına isim girer")
    public void başlıkKısmınaIsimGirer() {

        ucmsAdminPage.başlık.sendKeys(eklenenKodGrubuName);
    }

    @And("Genel özellikler tabına geçer")
    public void genelÖzelliklerTabınaGeçer() {

        ucmsAdminPage.genelÖzelliklerTab.click();
    }

    @And("Başarı durumu combosunda kriter dışını seçer")
    public void başarıDurumuCombosundaKriterDışınıSeçer() {
        ucmsAdminPage.başarıDurumuComboBox.click();
        ucmsAdminPage.kriterDışı.click();
    }

    @And("Müşteriye ulaşılma durumundan müşteriye ulaşılamadı seçer")
    public void müşteriyeUlaşılmaDurumundanMüşteriyeUlaşılamadıSeçer() {
        ucmsAdminPage.müşteriyeUlaşılmaDurumuComboBox.click();
        ucmsAdminPage.müşteriyeUlaşılamadı.click();
    }

    @And("Müşteri temas durumundan temas edilemedi seçer")
    public void müşteriTemasDurumundanTemasEdilemediSeçer() {
        ucmsAdminPage.müşteriyeTemasDurumuComboBox.click();
        ucmsAdminPage.müşteriyeTemasEdilemedi.click();

    }

    @And("Kaydete tıklar")
    public void kaydeteTıklar() {

        ucmsAdminPage.kaydetButton.click();
    }
}
