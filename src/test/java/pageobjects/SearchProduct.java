package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {

    private WebDriver driver;

    public SearchProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
