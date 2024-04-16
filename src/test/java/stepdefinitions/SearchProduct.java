package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePageEcommerce;
import pageobjects.ProductPage;

import java.io.File;


public class SearchProduct {

    private WebDriver driver;
    private HomePageEcommerce homePage;
    private ProductPage productPage;
    private ProductPage search_product;
    private ProductPage submit_search;

    @Before
    public void SetUp() {
        // new khởi tạo 1 đối tượng
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //bật to web

    }
    @Given("Im on the home page")
    public void imOnTheHomePage() {
        driver.get("https://automationexercise.com/");
        homePage = new HomePageEcommerce(driver);
    }

    @When("I go to product page")
    public void iGoToPrdPage() {
        homePage.clickProductButton();
        productPage = new ProductPage(driver);
    }

    @And("I search for product {string}")
    public void iSearchPrd(String product_name) {
        productPage.InputText(product_name);

    }
    @And("I click search product")
    public void iClickSearchProduct() {
        productPage.ClickSubmit();
    }
}
