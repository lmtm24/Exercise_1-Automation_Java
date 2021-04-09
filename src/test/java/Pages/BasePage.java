package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;

    }
    //Click method
    public void click (By locator){
        driver.findElement(locator).click();
    }

    public String getText(By element){
        String text = driver.findElement(element).getText();
        System.out.println(text);
        return text;
    }
    public void validateText(By element, String expectedText){
        String text = driver.findElement(element).getText();
        Assert.assertEquals(getText(element),expectedText);
    }
    public void typeText(By element,String text){
        driver.findElement(element).sendKeys(text);
        driver.findElement(element).sendKeys(Keys.ENTER);
    }

    public String iterateList(By element){
        List<WebElement> listElement = driver.findElements(element);
        String elementText ="";
        boolean validateEnable;
        for(int i =0;i<listElement.size();i++) {
            elementText   = listElement.get(i).getText();
            System.out.println(elementText);
            validateEnable = listElement.get(i).isEnabled();
            if (validateEnable == false) {
                System.out.println("Is Not Enabled");
            } else {
                System.out.println("Is Enabled");
            }
        }
        return elementText;
    }


    public void validateMenuList(By element, String expectedText){
        Assert.assertEquals(iterateList(element),expectedText);
    }

}
