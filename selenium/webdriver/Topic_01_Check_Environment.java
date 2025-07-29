package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_01_Check_Environment {
    WebDriver driver;

    @Test
    public void TC_01_Run_On_Firefox() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

    @Test
    public void TC_02_Run_On_Chrome() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

    @Test
    public void TC_03_Run_On_Edge() {
        String projectPath = System.getProperty("user.dir");
        String driverPath = projectPath + "\\webdriver\\edgedriver_win64\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);

        driver = new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }

}