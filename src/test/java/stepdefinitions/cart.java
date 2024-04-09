package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.io.File;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

import javax.naming.Name;
import java.util.List;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class cart {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //bật to web
    }

    @Given("I am go to page product")
    public void i_go_to_page_product() {
        driver.get("https://automationexercise.com/products");

    }

    @When("I am input {string} in search and click on search")
    public void i_am_input_in_search_and_click_on_search(String Name) {
        WebElement SearchField = driver.findElement(By.id("search_product"));
        SearchField.sendKeys(Name);
        WebElement SubmitField = driver.findElement(By.id("submit_search"));
        SubmitField.click();
        }

    @Then("I am verify search product successful")
    public void I_am_verify_search_product_successful() {
        WebElement SearchSuccess = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
        boolean Display = SearchSuccess.isDisplayed();
        assertEquals(Display, true);

    }

    @When("I click on add in the cart")
    public void I_click_on_add_in_the_cart() throws InterruptedException {
        WebElement AddtocartField = driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']"));
        AddtocartField.click();
        Thread.sleep(1000);
    }

    @And("I click on view cart go to the cart")
    public void I_click_on_view_cart_go_to_the_cart() {
        WebElement AddtocartField = driver.findElement(By.xpath("//a//u[text()='View Cart']"));
        AddtocartField.click();
    }

    @Then("I verify product in the cart have {string} and {string} correct to product in step 3")
    public void I_verify_product_in_the_cart_have_correct_to_product_in_step_3(String Name, String Price) {
        String Name_actual= driver.findElement(By.xpath("//td[@class='cart_description']")).getText();
        boolean Name_actual_2 = Name_actual.contains(Name);
        String Price_actual = driver.findElement(By.xpath("//td[@class='cart_price']")).getText();
        Assert.assertEquals(Price,Price_actual);
    }




}


















