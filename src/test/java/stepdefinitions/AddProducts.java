package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ja.但し;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProducts {
    private WebDriver driver;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", new File("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("I am on the add product page")
    public void I_am_on_the_add_product_page(){
        driver.get("https://automationexercise.com/products");
    }

    @When("I add {string} elements and click search")
    public void I_add_on_the_elements_and_click_search(String name_of_product){
        WebElement search_product = driver.findElement(By.id("search_product"));
        search_product.sendKeys(name_of_product);
        WebElement submit_search = driver.findElement(By.id("submit_search"));
        submit_search.click();
    }

    @Then("I search successful")
    public void I_search_successful(){
        WebElement product_actual = driver.findElement(By.xpath("//div[@class=\"product-image-wrapper\"]"));
         Assert.assertTrue(product_actual.isDisplayed());
    }

    @When("I add product to cart")
    public void i_add_product_to_cart(){
        WebElement product = driver.findElement(By.xpath("//div[@class=\"productinfo text-center\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(product);
        WebElement add_product_to_cart = driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[2]"));
        add_product_to_cart.click();
    }
  @And("I go to the cart")
    public void I_go_to_the_cart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
                WebElement go_to_cart = driver.findElement(By.xpath("//div/div/div[2]/p[2]/a"));
                System.out.println("========");
                System.out.println(go_to_cart);
                go_to_cart.click();
    }

    @Then("{string} and {string} should in the cart")
    public void product_and_price_should_in_the_cart(String product_name,String price)
    {
        WebElement productName = driver.findElement(By.xpath("//h4/a"));
        String productNameText = productName.getText();
        Assert.assertEquals(product_name,productNameText);
        WebElement productPrice = driver.findElement(By.xpath("//td[5]/p"));
        String productPriceText = productPrice.getText();
        Assert.assertEquals(price,productPriceText);
    }
    }

