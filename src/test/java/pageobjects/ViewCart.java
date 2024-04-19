package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {
    private WebDriver driver;

    @FindBy(xpath = "//td[@class='cart_description']/h4/a")
    private WebElement verify_productname;

    public ViewCart(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void VerifyPrd(String product_name)
    {
        verify_productname.getText();
        String productNameText = verify_productname.getText();
        Assert.assertEquals(product_name,productNameText);

    }
}
