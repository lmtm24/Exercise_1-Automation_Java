package Tests;

import Pages.HomePage;
import Pages.IphonesePage;
import Pages.MacPage;
import Pages.SearchPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMacPage extends BaseTest {

    HomePage homePage;
    MacPage macPage;
    SearchPage searchPage;
    IphonesePage iphonesePage;

    @BeforeTest
    public void setup(){
        homePage = new HomePage(driver);
        macPage = new MacPage(driver);
        searchPage = new SearchPage(driver);
        iphonesePage = new IphonesePage(driver);


    }

    @Test
    public void validateText(){
        String expectedText = "Bienvenidos al futuro de la Mac.";
        String expectedMenuList = "iPhone SE\n" + "Descripción\n" + "Por qué cambiar\n" + "Especificaciones\n" + "Comprar";
        String searchInputText = "iPhone SE";
        homePage.clickMacLink();
        macPage.validateText(expectedText);
        macPage.clickSearchButton();
        searchPage.searchIphone(searchInputText);
        searchPage.clickIphoneSE();
        iphonesePage.validateMenu(expectedMenuList);



    }

}
