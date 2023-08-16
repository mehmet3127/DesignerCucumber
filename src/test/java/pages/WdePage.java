package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WdePage {

    public WdePage() {//Constructor oluşturup public yapmamız gerekiyor

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "/Window/Custom/Edit[1]")
    public WebElement userName;

    @FindBy(xpath = "/Window/Custom/Edit[2]")
    public WebElement password;


    @FindBy(xpath = "/Window/Custom/Button[1]")
    public WebElement login;

}
