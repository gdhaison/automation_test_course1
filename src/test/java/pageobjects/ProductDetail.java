package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetail {
    private WebDriver driver;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    private WebElement add_cart;

    @FindBy(xpath = "//p[@class='text-center']//a[@href='/view_cart']")
    private WebElement go_to_cart;

    public ProductDetail(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void AddCart()
    {

        add_cart.click();
    }
    public void GoToCart()
    {
        go_to_cart.click();
    }
}
