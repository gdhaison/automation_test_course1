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

    @Given("the site {string} is open")
    public void theSiteDuckDuckGoIsOpen(String site) {
//        String url = "";

//        switch (site.toLowerCase()){
//            case "duckduckgo":
//                url = "https://duckduckgo.com/";
//                break;
//            case "automation practise store":
//                url = "http://automationpractice.com/";
//                break;
//            default:
//                Assert.fail("Something is wrong. The website '" + site + "' you are trying to open in not recognised. ");
//        }

        startDriver(site);
        Waits waits = new Waits(driver);
        LoginPage loginPage = new LoginPage(driver);

//        switch (site.toLowerCase()){
//            case "duckduckgo":
//                Homepage homepage = new Homepage(driver);
//                waits.waitForElement(homepage.logoHomepage);
//                break;
//            case "automation practise store":
//                AutomationStore automationStore = new AutomationStore(driver);
//                waits.waitForElement(automationStore.logoStore);
//                break;
//            default:
//                System.out.println("Something is wrong. The website '" + site + "' you are trying to open in not recognised. ");
//        }
    }
}
