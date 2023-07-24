package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WdePage {

        public WdePage() {//Constructor oluşturup public yapmamız gerekiyor

            PageFactory.initElements(Driver.getDriver(), this);

        }
        @FindBy(name = "User Name")
        public WebElement userName;
}
