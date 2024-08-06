package Pages;

import org.openqa.selenium.*;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //locators
    private By usernameLocator = new By.ById("loginusername");
    private By passwordLocator = new By.ById("loginpassword");
    private By loginButtonLocator = By.cssSelector("button[onclick=\"logIn()\"]");

    //WebElements
    private WebElement usernameField = _driver.findElement(usernameLocator);
    private WebElement passwordField = _driver.findElement(passwordLocator);
    private WebElement loginButton = _driver.findElement(loginButtonLocator);

    //Methods
    public void FillInCredentials(String username, String password){
        try{
            usernameField.clear();
            Thread.sleep(2000);
            usernameField.sendKeys(username);
          //  actions.moveToElement(usernameField).sendKeys(username).build().perform();
            passwordField.clear();
            Thread.sleep(2000);
            passwordField.sendKeys(password);
           // actions.moveToElement(passwordField).sendKeys(password).build().perform();

        }
        catch (ElementNotInteractableException | InterruptedException exception)
        {
            if (!usernameField.getText().equals(username)) {
                usernameField.clear();
                actions.moveToElement(usernameField).sendKeys(username).build().perform();
            }

            if (!passwordField.getText().isEmpty()) {
                passwordField.clear();
                actions.moveToElement(passwordField).sendKeys(password).build().perform();
            }
        }
    }

    public void ClickLogin() throws InterruptedException {
        try{
            Thread.sleep(2000);
            loginButton.click();
            Thread.sleep(3000);


        }catch (ElementClickInterceptedException exception)
        {
            Thread.sleep(2000);
            loginButton.click();
        }
    }




}
