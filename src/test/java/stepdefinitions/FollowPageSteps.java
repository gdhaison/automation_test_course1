package stepdefinitions;
import io.cucumber.java.en.*;
import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.ObjectIdGenerators;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Random;

public class FollowPageSteps {
    private WebDriver driver;

    @Given("I am go to page")
    public void I_am_go_to_page() {
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.get("https://automationpanda.com/");
    }

    @When("I click on item BDD in navigation bar")
    public void I_click_on_item_BDD() {
        WebElement BDDbutton = driver.findElement(By.id("menu-item-6846"));
        BDDbutton.click();
    }

    @And("I create random email")
    public static void I_creat_random_email() {
        String alphabet = "abcdefghjklmn01234567890";
        StringBuilder sb = new StringBuilder();
        Random email = new Random();
        int length = 7;
        for (int i = 0; i < length; i++) {
            int index = email.nextInt(alphabet.length());
            char emailChar = alphabet.charAt(index);
            sb.append(emailChar);
        }

        String randomString = sb.toString();
        String Randomemail = (randomString + "@gmail.com");



    }
    @And("I enter random email on follow item")
    public void i_enter_the_username() {
        String alphabet = "abcdefghjklmn01234567890";
        StringBuilder sb = new StringBuilder();
        Random email = new Random();
        int length = 7;
        for (int i = 0; i < length; i++) {
            int index = email.nextInt(alphabet.length());
            char emailChar = alphabet.charAt(index);
            sb.append(emailChar);
        }

        String randomString = sb.toString();
        String Randomemail = (randomString + "@gmail.com");
        WebElement emailaddressField = driver.findElement(By.id("subscribe-field"));
        emailaddressField.sendKeys(Randomemail);
        WebElement FollowbuttonField = driver.findElement(By.xpath("//button[@class='wp-block-button__link']"));
        FollowbuttonField.click();
    }

    @Then ("I see noti email confirm")
    public void I_see_noti_email_confirm(){
        WebElement notiemail = driver.findElement(By.xpath("//div[@class='actnbr-message']"));
        boolean Display = notiemail.isDisplayed();
        assertEquals(Display, true);
    }


}















