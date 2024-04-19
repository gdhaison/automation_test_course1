package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageEcommerce {
        private WebDriver driver;      //khởi tạo homepage

        //định nghĩa 1 hàm khởi tạo Product
        @FindBy(xpath = "//a[@href='/products']")
        private WebElement product_button;
//        @FindBy(id="search_product")
//        private WebElement search_product;
//
//        @FindBy(id = "submit_search")
//        public WebElement submit_search;
        //hàm tạo (search thêm)
        public HomePageEcommerce(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void clickProductButton()   {
            product_button.click();
        }

}
