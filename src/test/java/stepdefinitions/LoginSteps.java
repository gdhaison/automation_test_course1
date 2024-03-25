//Muốn chạy 1 testcase thì phải viết các keyword được gọi là các step
package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.vi.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LoginSteps {
    //Khai báo 1 web driver
    private WebDriver driver;
    @Given("I am on the login page")
    //Khai báo hàm
    public void i_am_login_page(){
        //Set biến môi trường cho dự án hoặc cho xpath dùng chrome thì luôn dùng như này
        System.setProperty("webdriver.chrome.driver", new File("chromedriver.exe").getPath());
        driver = new ChromeDriver();
        //Vào trang web mình cần test thì khai báo như sau:
        driver.get("https://the-internet.herokuapp.com/login");
    }
    //Khai báo biến string vì biến mình muốn truyền vào là chuỗi string
    @When("I enter the username {string}")
    //Khai báo biến username dạng string
    public void i_enter_the_username(String username){
        //Câu lệnh này sẽ in ra tên biến truyền khi điền ở bên feature VD:"tomsmith"
        //System.out.println(username);
        //Khai báo Xpath
        WebElement usernameField = driver.findElement(By.id("username"));
        //Truyền dữ liệu vào thì dùng sendKeys ở đây truyền username vì trên mình đã khai báo 1 biến là username
        usernameField.sendKeys(username);
    }
    @And("I enter password {string}")
    public void i_enter_password(String password){
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
    }
    @And("I click on login button")
    public void i_click_on_login_button(){
        WebElement Loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        Loginbtn.click();
    }
    @Then("I should see a logout button")
    public void i_should_see_a_logout_button(){
        WebElement Logoutbtn = driver.findElement(By.xpath("//a[@href='/logout']"));
        Assert.assertTrue(Logoutbtn.isDisplayed());
    }
//    @Biết("Tôi đang ở login page")


}
