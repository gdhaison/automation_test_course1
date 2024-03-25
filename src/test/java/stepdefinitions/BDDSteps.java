package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.vi.*;
import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BDDSteps {
    private WebDriver driver;
    @Given("I am on the panda page")
    public void i_am_on_the_panda_page(){
        System.setProperty("webdriver.chrome.driver",new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.get("https://automationpanda.com/");
    }
    @When("I click BDD on the navigation bar")
    public void i_click_BDD_on_the_nav_bar(){
        WebElement BDDbtn = driver.findElement(By.xpath("//a[@href='https://automationpanda.com/bdd/']"));
        BDDbtn.click();
    }
    @And("I enter a random email")
    public void i_enter_a_random_email(){
        WebElement emailField = driver.findElement(By.id("subscribe-field"));
   //     int length = 10;
        String randomString = new RandomString().nextString();
        String email = randomString + "@gmail.com";
        emailField.sendKeys(email);
    }
    @And("I click follow button")
    public void i_click_follow_button(){
        WebElement  Followbtn= driver.findElement(By.xpath("//button[contains(text(),'Follow')]"));
        Followbtn.click();

    }
    @Then("I should see a message success")
    public void i_should_see_a_mess_success(){
        WebElement  MessSuccess = driver.findElement(By.xpath("//div[@class='tip-inner actnbr-follow-bubble']"));
        Assert.assertTrue(MessSuccess.isDisplayed());
    }
}
