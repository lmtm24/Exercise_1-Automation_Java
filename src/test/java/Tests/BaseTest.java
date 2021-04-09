package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    String url="https://www.apple.com/mx/";

    @BeforeTest
    public void baseTestSetup(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
