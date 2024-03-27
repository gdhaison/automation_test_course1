package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;





import java.io.File;

public class PractiveAutomationPanda {
    private WebDriver driver;

    @Given("i am on the page automationpanda")
    public void i_am_on_the_automationpanda_page() {
        System.setProperty("webdriver.chrome.driver", new File("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get("https://automationpanda.com/");
    }

    @Given("i click BDD at navigation bar")
    public void i_click_BDD_at_navigation_bar() {
        WebElement BDDbuton = driver.findElement(By.xpath("//a[@href=\"https://automationpanda.com/bdd/\"]"));
        BDDbuton.click();
    }

    @And("I enter email {string}")
    public void i_enter_email(String input_email) {
        String randomEmail = TestUtils.generateRandomString(8);
        WebElement emailInputElement = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
        emailInputElement.sendKeys(randomEmail + "@gmail.com");
    }
    @And ("i click on follow button")
    public  void i_click_on_follow_button(){
        WebElement followButtonElement = driver.findElement(By.xpath("//button[@class=\"wp-block-button__link\"]"));
        followButtonElement.click();
    }
    @Then ("i should see a notification email confirm")
            public void i_should_see_a_notification_email_confirm(){
        WebElement notificationElement = driver.findElement(By.xpath("//div[@id=\"follow-bubble\"]"));
        assertTrue("Notification email confirm should be displayed", notificationElement.isDisplayed());
    }

}