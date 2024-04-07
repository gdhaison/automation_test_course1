package stepdefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import io.cucumber.java.en.*;

public class AddRemove {
    private WebDriver driver;
    //Định nghĩa 1 hành động xảy ra trước khi chạy testcase
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();   //bật to web
//    }

        @Given("I am on the add remove element page")
            public void im_on_the_add_remove_page() {
                driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        }

        @When("I add {int} elements")
        public void i_add_elements ( int number_of_elements){
            for (int i = 0; i < number_of_elements; i++) {
                driver.findElement(By.xpath("//*[text()='Add Element']")).click();
            }

        }

        @Then("{int} delete button should be display")
        public void delete_button_should_be_display(int number_of_element_expected){
            int number_of_element_actual = driver.findElements(By.className("added-manually")).size();
            Assert.assertEquals(number_of_element_expected, number_of_element_actual);
//            System.out.print(">>>>>>>>>>>>>>>>");
//            System.out.print(number_of_element_actual);
//            System.out.print(">>>>>>>>>>>>>>>>");

        }

        @When ("I delete {int} elements")
        public void i_delete_elements(int number_to_delete) {
            for (int i =0; i < number_to_delete; i++) {
                driver.findElement(By.className("added-manually")).click();

            }
        }

        @Then("{int} delete button should remain")
        public void delete_button_should_remain (int remain_number_to_delete_expected) {
            int remain_number_to_delete_actual = driver.findElements (By.className("added-manually")).size();
            Assert.assertEquals(remain_number_to_delete_expected, remain_number_to_delete_actual);
            for (int i = 0; i < remain_number_to_delete_actual; i++) {
                driver.findElement(By.className("added-manually")).click();
            }

        }




//    @After
//    public void tearDown() {
//            driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//            driver.quit();
//        }
    }