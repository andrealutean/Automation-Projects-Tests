package tests;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest{



    @Test(description="Verify login is succesfull with a correct username and password")
    public void testValidLogin(){
    driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getLoginForm().submit();
        assertTrue(driver.getCurrentUrl().contains("/admin/"),
                "Login was unsuccesfull with the default data");
    }
}
