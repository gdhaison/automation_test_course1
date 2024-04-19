package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private WebDriver driver;
    @FindBy(id="search_product")
    private WebElement search_product;

    @FindBy(id = "submit_search")
    private WebElement submit_search;

    @FindBy(xpath = "//i[@class='fa fa-plus-square']")
    private WebElement view_detail;


    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void InputText(String product_name)
    {
        search_product.sendKeys(product_name);
    }

    public void ClickSubmit()
    {
        submit_search.click();
    }

    public void ViewDetail()
    {
        view_detail.click();
    }

}
