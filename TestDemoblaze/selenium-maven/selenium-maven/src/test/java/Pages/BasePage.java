package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BasePage{

    public WebDriver _driver;
    public Actions actions;
    public HeaderPage headerPage;
    public JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver){
        this._driver = driver;
        actions = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor) _driver;
    }




    //locators


    //find elements

    //open browser and navigate
    public void GoTo(String url){
        _driver.get(url);
    }

    public LoginPage Login(){
        headerPage = new HeaderPage(_driver);
        headerPage.LoginPage();

        return new LoginPage(_driver);
    }

    public SignUpPopUpPage SignUp(){

       headerPage = new HeaderPage(_driver);
       headerPage.OpenSignUpPage();

       return new SignUpPopUpPage(_driver);
    }

    public HomePage Home(){

        headerPage = new HeaderPage(_driver);
        headerPage.HomePage();

        return new HomePage(_driver);
    }

    public CartPage Cart(){

        headerPage = new HeaderPage(_driver);
        headerPage.CartPage();

        return new CartPage(_driver);
    }

    public void Back(){
        javascriptExecutor.executeScript("history.back()");
    }

    public void Forward(){
        javascriptExecutor.executeScript("history.forward()");

    }
}
