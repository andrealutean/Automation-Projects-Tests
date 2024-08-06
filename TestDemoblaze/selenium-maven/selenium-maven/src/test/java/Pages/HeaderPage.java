package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage{
    public HeaderPage(WebDriver driver){
        super(driver);
    }

    //locators
    By signUpButtonLocator = By.id("signin2");
    By loginButtonLocator = By.id("login2");
    By homeButtonLocator = By.cssSelector("li a[href=\"index.html\"]");
    //By cartButtonLocator = By.cssSelector("a[onclick=\"showcart()\"]");
    By cartButtonLocator = By.id("cartur");



    //find elements
    public WebElement signUpButton = _driver.findElement(signUpButtonLocator);
    public WebElement loginButton = _driver.findElement(loginButtonLocator);
    public WebElement homeButton = _driver.findElement(homeButtonLocator);
    public WebElement cartButton = _driver.findElement(cartButtonLocator);


    //signup method
    public void OpenSignUpPage(){
        try{
            signUpButton.click();
        }
        catch(ElementClickInterceptedException ex){
            signUpButton.click();
        }
    }

    public void LoginPage(){
        try{
            loginButton.click();
        }
        catch(ElementClickInterceptedException ex){
            loginButton.click();
        }
    }

    public void HomePage(){
        try{
            homeButton.click();
        }
        catch(ElementClickInterceptedException ex){
            homeButton.click();
        }
    }

    public void CartPage(){
        try{
            cartButton.click();
        }
        catch(ElementClickInterceptedException ex){
            cartButton.click();
        }
    }
}
