package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPopUpPage extends BasePage{
    public SignUpPopUpPage(WebDriver driver){
        super(driver);
    }

    //locators
    By userNameLocator = By.id("sign-username");
    By passwordLocator = By.id("sign-password");
    By signUpLocator = By.xpath("//button[@onclick = \"register()\"]");

    //elements
    public WebElement userNameInput = _driver.findElement(userNameLocator);
    public WebElement passwordInput = _driver.findElement(passwordLocator);
    public WebElement signUpButton = _driver.findElement(signUpLocator);


    //action methods
    public void CreateNewUser(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);

        actions.moveToElement(signUpButton).click().build().perform();
    }

    public boolean SignUpSuccessful(){
        Alert alert = _driver.switchTo().alert();
        return alert.getText().equals("Sign up successful.");
    }

}
