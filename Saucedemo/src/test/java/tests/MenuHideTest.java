package tests;

import PageObjects.BaseTest;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import org.testng.annotations.Test;

public class MenuHideTest extends BaseTest {

    @Test(description="Menu open and hide")
    public void menuApearAndHide() throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";
        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();

        MenuPage menu = new MenuPage(driver);
        menu.getMenubutton().click();
        Thread.sleep(3000);
        menu.getClosebutton().click();

    }
}
