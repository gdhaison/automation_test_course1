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

public class AddRemove {
    private WebDriver driver;
    //Định nghĩa 1 hành động xảy ra trước khi chạy testcase


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
    public void the_delete_button_should_be_display(int number_of_elements_expected) {
        //for (int i =0; i < number_of_elements; i++) {
        int number_of_element_actual = driver.findElements(By.className("added-manually")).size();
        Assert.assertEquals(number_of_elements_expected, number_of_element_actual);
//        System.out.print(">>>>>>>>>>>");
//        System.out.print(number_of_element_actual);
//        System.out.print(">>>>>>>>>>>");
        //Cach 2: List<WebElement> deleteButtons =  driver.findElements(By.xpath("//*[text()='Delete']"));
        //Assert.assertEquals(deleteButtons.size(),number_of_elements);
    }

    @When("I delete {int} elements")
    public void i_deleted_elements(int number_to_delete) {
        for (int i = 0; i < number_to_delete; i++) {
            driver.findElement(By.className("added-manually")).click();
        }
    }

    @Then("{int} delete button should remain")
    public void button_delete_button_should_remain(int remaining_element_expected) {
        int remaining_element_actual = driver.findElements(By.className("added-manually")).size();
        Assert.assertEquals(remaining_element_expected, remaining_element_actual);
    }


//    @After
//    public void tearDown() {
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        driver.quit(); //đóng cửa sổ
//    }
}
//
//    @After
//    public void tearDown() {
//        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//        driver.quit(); //đóng cửa sổ
//    }

