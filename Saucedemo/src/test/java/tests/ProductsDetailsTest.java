package tests;

import PageObjects.BaseTest;
import PageObjects.Config;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProductsDetailsTest extends BaseTest {

    @Test (description="View products details")
    public void itemdetails() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";
        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();

        for(int i=0;i<Config.items.size();i++) {
            WebElement item = driver.findElement(By.xpath("//div[contains(text(),'" + Config.items.get(i) + "')]"));
            item.click();
            Thread.sleep(3000);
            driver.get("https://www.saucedemo.com/inventory.html");
        }

//

    }

}
