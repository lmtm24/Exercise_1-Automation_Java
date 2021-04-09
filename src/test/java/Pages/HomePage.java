package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By macLink = By.xpath("//nav[@id='ac-globalnav']//ul[@class='ac-gn-list']//a[@href='/mx/mac/']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMacLink(){
        click(macLink);

    }


}
