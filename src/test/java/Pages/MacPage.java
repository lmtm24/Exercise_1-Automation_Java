package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacPage extends  BasePage{

    By bienvenidosText = By.cssSelector(".typography-hero-headline-super");
    By searchButton = By.cssSelector(".ac-gn-list [data-analytics-title='search']");

    public MacPage(WebDriver driver) {
        super(driver);
    }

    public void validateText(String expectedText){
        validateText(bienvenidosText,expectedText);
    }
    public void clickSearchButton(){
        click(searchButton);
    }

}
