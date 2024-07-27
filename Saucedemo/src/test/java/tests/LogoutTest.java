package tests;

import PageObjects.BaseTest;
import PageObjects.LoginPage;
import PageObjects.MenuPage;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {


    @Test(description="Verify if you can logout")
    public void testLogout() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";
        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();
        MenuPage logout = new MenuPage(driver);
        logout.getMenubutton().click();
        Thread.sleep(3000);
        logout.getLogoutbutton().click();

    }
}
