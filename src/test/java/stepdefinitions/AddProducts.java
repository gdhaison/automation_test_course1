package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddProducts {
    private WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //bật to web
}

    @Given("I am on the add product page")
    public void im_on_the_add_product_page() {
        driver.get("https://automationexercise.com/products");
    }

    @When("I add {string} elements and click search")
    public void i_add_element(String name_of_product) {
        WebElement searchproduct = driver.findElement(By.id("search_product"));
        searchproduct.sendKeys(name_of_product);
        driver.findElement(By.id("submit_search")).click();
    }

    @Then("I search {string} successful")
    public void i_search_product_successful(String name_of_product_expected) {
            WebElement product_actual = driver.findElement(By.className("overlay-content"));
            String name_of_product_actual = driver.get
            Assert.assertEquals(name_of_product_expected,name_of_product_actual);
    }
}
