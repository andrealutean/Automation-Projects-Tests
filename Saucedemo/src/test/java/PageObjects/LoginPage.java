package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseTest{


    public LoginPage(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }
//locators
    @FindBy (id="user-name")
    private WebElement usernamefield;

    @FindBy (xpath = "//input[@id='password']")
    private WebElement passwordfield;

    @FindBy (id="login-button")
    private WebElement loginbutton;

    @FindBy(xpath="//div[@class='error-message-container error']")
    private WebElement errormessage;

    public void FillCredentials(String username,String password ) throws InterruptedException {
        usernamefield.clear();
        Thread.sleep(2000);
        usernamefield.sendKeys(username);
        passwordfield.clear();
        Thread.sleep(2000);
        passwordfield.sendKeys(password);

    }



    public WebElement getLoginbutton() {
        return loginbutton;
    }

    public WebElement getErrormessage() {
        return errormessage;
    }
}
