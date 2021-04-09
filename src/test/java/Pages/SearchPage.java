package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    By iphoneLink = By.xpath("//div[@class='as-product-description']/h2[contains(text(),'iPhone SE')]");
    By searchInputField = By.cssSelector("input#ac-gn-searchform-input");



    public void searchIphone(String searchText){
        typeText(searchInputField,searchText);
    }
    public void clickIphoneSE(){
        click(iphoneLink);
    }

}
