package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "UserName")
    public WebElement user_name;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(name = "quan-ly")
    public WebElement login_btn;
}
