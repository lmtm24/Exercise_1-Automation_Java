package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.print.DocFlavor;

public class IphonesePage extends BasePage {

    By menu = By.xpath("/html//nav[@id='ac-localnav']");



    public IphonesePage(WebDriver driver) {
        super(driver);
    }


    public void validateMenu(String expectedMenuList){
        validateMenuList(menu,expectedMenuList);
    }
}
