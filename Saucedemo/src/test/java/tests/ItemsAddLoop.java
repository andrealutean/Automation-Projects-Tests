package tests;

import PageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ItemsAddLoop extends BaseTest {

    @Test(description = "add to cart from item details loop")
    public void addproductsloop () throws InterruptedException {
        //String elements = Config.items.get(0);
        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";
        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();

        for(int i=0;i<Config.items.size();i++) {
            ItemPage itemPage = new ItemPage(driver);
            WebElement item = driver.findElement(By.xpath("//div[contains(text(),'" + Config.items.get(i) + "')]"));
            item.click();
            Thread.sleep(3000);
            itemPage.getAddtocartbutton().click();
            itemPage.getBacktoproducts().click();
            //driver.get("https://www.saucedemo.com/inventory.html");
        }
    }

    @Test(description = "add items to cart from homepage loop")
    public void addprodusctsloopfromhomepage () throws InterruptedException {

        driver.get("https://www.saucedemo.com/");
        LoginPage loginpage = new LoginPage(driver);
        String username = "standard_user";
        String password = "secret_sauce";
        loginpage.FillCredentials(username,password);
        loginpage.getLoginbutton().click();

        for(int i=0;i<Config.addtocarthomepage.size();i++) {
            WebElement addtocart = driver.findElement(By.xpath("//button[@id='" + Config.addtocarthomepage.get(i) + "']"));
            addtocart.click();
            Thread.sleep(3000);
        }

        for(int j=0;j<Config.addtocarthomepage.size();j++) {
            WebElement remove = driver.findElement(By.xpath("//button[@id='" + Config.removefromcarthomepage.get(j) + "']"));
            remove.click();
            Thread.sleep(3000);
        }





    }
}
