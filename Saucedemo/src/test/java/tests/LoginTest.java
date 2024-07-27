package tests;

import PageObjects.BaseTest;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test(description="Verify login is succesfull with a correct username and password")
    public void testValidLogin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";

       loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();
        assertTrue(driver.getCurrentUrl().contains("inventory"),
                "Login was unsuccesfull with the default data");
    }

    @Test(description="Verify login with incorrect username and password")
    public void testInvalidLogin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce11";

        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();
        //get message from locator
        String message= loginpage.getErrormessage().getText();
        assertEquals(message,"Epic sadface: Username and password do not match any user in this service");

    }


}
