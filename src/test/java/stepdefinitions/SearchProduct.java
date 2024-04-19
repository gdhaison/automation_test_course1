package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePageEcommerce;
import pageobjects.ProductDetail;
import pageobjects.ProductPage;
import pageobjects.ViewCart;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;


public class SearchProduct {

    private WebDriver driver;
    private HomePageEcommerce homePage;
    private ProductPage productPage;
    private ProductPage search_product;
    private ProductPage submit_search;
    private ProductDetail productDetail;
    private ViewCart viewcart;

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

    @And("I click view product detail")
    public void iClickViewPrdDetail() {
        productPage.ViewDetail();
        productDetail = new ProductDetail(driver);

    }

    @And("I add my product to cart")
    public void Iaddproducttocart() {
        productDetail.AddCart();
    }

    @And("I go to cart")
    public void Igotocart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Thread.sleep(5000);
        productDetail.GoToCart();
        viewcart = new ViewCart(driver);
    }

    @Then("I see {string} display in the cart")
        public void iSeePrd(String product_name)
        {
            viewcart.VerifyPrd(product_name);

    }
}
