package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseTest{
    public CartPage(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//span[@class='shopping_cart_badge']")
    private WebElement spancart;
    @FindBy (xpath = "//a[@class='shopping_cart_link']")
    private WebElement cart;
    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement checkoutbutton;
    @FindBy (xpath = "//input[@id='first-name']")
    private WebElement FirstNameField;
    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement LastNameField;
    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement PostalCodeField;
    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continuebutton;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishbutton;
    @FindBy(xpath = "//div[@class='error-message-container error']")
    private WebElement error;

    public WebElement getError() {
        return error;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getCheckoutbutton() {
        return checkoutbutton;
    }

    public WebElement getFirstNameField() {
        return FirstNameField;
    }

    public WebElement getLastNameField() {
        return LastNameField;
    }

    public WebElement getPostalCodeField() {
        return PostalCodeField;
    }

    public WebElement getContinuebutton() {
        return continuebutton;
    }

    public WebElement getFinishbutton() {
        return finishbutton;
    }

    public WebElement getSpancart() {
        return spancart;
    }
}
