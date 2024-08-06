package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPopUpPage extends BasePage{
    public SignUpPopUpPage(ChromeDriver driver){
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
    public void CreateNewUser(String username, String password) throws InterruptedException {
        userNameInput.sendKeys(username);
        Thread.sleep(2000);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        actions.moveToElement(signUpButton).click().build().perform();
        Thread.sleep(2000);
    }

    public boolean SignUpSuccessful(){
        Alert alert = _driver.switchTo().alert();
        return alert.getText().equals("Sign up successful.");
    }

}
