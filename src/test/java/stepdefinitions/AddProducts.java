package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

//  @Before
//    public void SetUp() {
//        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();   //bật to web
//
//    }

    @Given("I am on the add product page")
    public void im_on_the_add_product_page() {
        driver.get("https://automationexercise.com/products");
    }

    @When("I add {string} elements and click search")
    public void i_add_element_and_click_search(String name_of_product) {
        WebElement search_product = driver.findElement(By.id("search_product"));
        search_product.sendKeys(name_of_product);
        driver.findElement(By.id("submit_search")).click();
    }

    @Then("I search successful")
    public void i_search_product_successful(){
            WebElement product_actual = driver.findElement(By.className("overlay-content"));
            Assert.assertTrue(product_actual.isDisplayed());
    }

    @When("I add product to cart")
    public void i_add_product_to_cart(){
        WebElement product = driver.findElement(By.xpath("//div[@class='productinfo text-center']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(product);
        WebElement add_product_to_cart = driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']"));
        add_product_to_cart.click();
    }
    @And("I go to the cart")
    public void I_go_to_the_cart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Thread.sleep(5000);
        WebElement go_to_cart = driver.findElement(By.xpath("//p[@class='text-center']//a[@href='/view_cart']"));
        System.out.println("========");
        System.out.println(go_to_cart);
        go_to_cart.click();
    }
    @Then("{string} and {string} should in the cart")
    public void product_and_quantity_should_in_the_cart(String product_name,String number_of_quantity){
        WebElement productName = driver.findElement(By.xpath("//td[@class='cart_description']/h4/a"));
        String productNameText = productName.getText();
        Assert.assertEquals(product_name,productNameText);
        WebElement productPrice = driver.findElement(By.xpath("//td[@class='cart_price']"));
        String productPriceText = productPrice.getText();
        Assert.assertEquals(number_of_quantity,productPriceText);
    }
}
