package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_Selenium_Locator {
    WebDriver driver;

    @BeforeClass
    public void initialBrowser(){
        //Mo browser len
        driver = new FirefoxDriver();
        //Mo app len den man hinh login
        driver.get("https://demo.nopcommerce.com/login");
    }
    @Test
    public void TC_01_(){
        // Tuong tac len email textbox
        //    <input class="email" autofocus="" type="email" data-val="true"
        //    data-val-regex="Wrong email"
        //    data-val-regex-pattern="^(([^&lt;&gt;()\[\]\\.,;:\s@&quot;]+(\.[^&lt;&gt;()\[\]\\.,;:\s@&quot;]+)*)|(&quot;.+&quot;))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$"
        //    data-val-required="Please enter your email"
        //    id="Email" name="Email">
        //HTML Source Code
        //Thẻ - thuộc tính - giá trị thuộc tính
        //Tagname - attribute - value

        //Css - Xpath
        //Xpath : //tagname[@attribute='value']
        //CSS:  tagname[attribute='value']

        //Tương tác lên  Email Address textbox
        // 8 loại locator để tìm Email address textbox

        driver.findElement(By.id(""));
    }
    @Test
    public void TC_02_(){

    }
    @AfterClass
    public void cleanBrowser(){
        driver.quit();
    }
}