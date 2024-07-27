package tests;

import PageObjects.*;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OrderTest extends BaseTest {

@Test (description = "order products")
    public void order() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    LoginPage loginpage = new LoginPage(driver);
    String username = "standard_user";
    String password = "secret_sauce";
    loginpage.FillCredentials(username,password);
    loginpage.getLoginbutton().click();
     //order E2E
    WebElement addtocart = driver.findElement(By.xpath("//button[@id='" + Config.addtocarthomepage.get(2) + "']"));
    addtocart.click();
    CartPage cartPage = new CartPage(driver);
    cartPage.getCart().click();
    cartPage.getCheckoutbutton().click();
    cartPage.getFirstNameField().sendKeys("fdde");
    cartPage.getLastNameField().sendKeys("saee");
    cartPage.getPostalCodeField().sendKeys("547895");
    cartPage.getContinuebutton().click();
    cartPage.getFinishbutton().click();
}
@Test
public void orderwithoutfirsname() throws InterruptedException {
    driver.get("https://www.saucedemo.com/");
    LoginPage loginpage = new LoginPage(driver);
    String username = "standard_user";
    String password = "secret_sauce";
    loginpage.FillCredentials(username,password);
    loginpage.getLoginbutton().click();

    CartPage cartPage = new CartPage(driver);
    cartPage.getCart().click();
    cartPage.getCheckoutbutton().click();
    cartPage.getFirstNameField().sendKeys("fdde");
    cartPage.getContinuebutton().click();
    assertTrue(driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText().contains("Error"));

}

}
