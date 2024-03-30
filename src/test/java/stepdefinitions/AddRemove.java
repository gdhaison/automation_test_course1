package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddRemove {
    private WebDriver driver;
    //Định nghĩa 1 hành động xảy ra trước khi chạy testcase

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver",new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();   //bật to web

    }

    @Given("I am on the add remove element page")
    public void im_on_the_add_remove_page() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I add {int} elements")
    public void i_add_elements(int number_of_elements) {
        for (int i = 0; i < number_of_elements; i++) {
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        }

    }
    @Then("{int} delete button should be display")
    public void delete_button_should_be_display (int number_of_elements) {
        //for (int i =0; i < number_of_elements; i++) {
        List<WebElement> deleteButtons =  driver.findElements(By.xpath("//*[text()='Delete']"));
        if (deleteButtons.size() == number_of_elements){
            System.out.println("Test case pass");
        }
        }
    }
//
//    @After
//    public void tearDown() {
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        driver.quit(); //đóng cửa sổ
//    }

