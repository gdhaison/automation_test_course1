package stepdefinitions;


import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pageobjects.LoginPage;
import pageobjects.Searchresults;
import pageobjects.AutomationStore;
import utils.FileUtils;
import utils.Validations;
import utils.Waits;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class KiotVietLogin {
    private WebDriver driver;

    public void startDriver(String url){

        System.setProperty("webdriver.chrome.driver", new File("chromedriver").getPath());
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {

        if(scenario.isFailed()){
            FileUtils fileUtils = new FileUtils();
            fileUtils.addScreenshot(scenario, driver);
        }

        driver.quit();

    }

    @Given("the website {string} is open")
    public void login(String site) {

        startDriver(site);

        Waits waits = new Waits(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.user_name.sendKeys("admin");
        loginPage.password.sendKeys("123");
        loginPage.login_btn.click();

        /* waits.waitForElement(loginPage.logo); */
    }
}
