package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.io.File;

public class LoginSteps {
    //Khai báo webdriver
    private WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_login_page() {
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I enter the username {string}")
    //
    public void i_enter_the_username(String userName) {
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(userName);
    }

    @And("I enter password {string}")
    public void i_enter_password(String password) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        WebElement Loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        Loginbutton.click();
    }

    @Then("I should see a logout button")
    public void see_a_logout_button() {
        WebElement Logoutbutton = driver.findElement(By.xpath("//i[contains(@class,'icon-signout')]"));
        boolean Display= Logoutbutton.isDisplayed();
        assertEquals(Display,true);

    }

}
