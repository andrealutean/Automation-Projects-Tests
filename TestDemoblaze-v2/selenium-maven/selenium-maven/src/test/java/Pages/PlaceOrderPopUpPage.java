package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PlaceOrderPopUpPage extends BasePage {
    public PlaceOrderPopUpPage(ChromeDriver driver) {
        super(driver);
    }

    //Locators
    By nameLocator = By.id("name");
    By countryLocator = By.id("country");
    By cityLocator = By.id("city");
    By cardLocator = By.id("card");
    By monthLocator = By.id("month");
    By yearLocator = By.id("year");
    By purchaseButtonLocator = By.cssSelector("button[onclick=\"purchaseOrder()\"");

    //WebElements
    WebElement nameInput = _driver.findElement(nameLocator);
    WebElement countryInput = _driver.findElement(countryLocator);
    WebElement cityInput = _driver.findElement(cityLocator);
    WebElement cardInput = _driver.findElement(cardLocator);
    WebElement monthInput = _driver.findElement(monthLocator);
    WebElement yearInput = _driver.findElement(yearLocator);
    WebElement purchaseButton = _driver.findElement(purchaseButtonLocator);

    //Methods
    public void FillOrderDetails(String name, String country, String city, String cardNumber, int month, int year) throws InterruptedException {
        actions.moveToElement(nameInput).build().perform();
        nameInput.sendKeys(name);

        actions.moveToElement(countryInput).build().perform();
        countryInput.sendKeys(country);

        actions.moveToElement(cityInput).build().perform();
        cityInput.sendKeys(city);

        actions.moveToElement(cardInput).build().perform();
        cardInput.sendKeys(cardNumber);

        actions.moveToElement(monthInput).build().perform();
        monthInput.sendKeys(String.valueOf(month));

        actions.moveToElement(yearInput).build().perform();
        yearInput.sendKeys(String.valueOf(year));

    }
public void ClickPurchase(){
        actions.moveToElement(purchaseButton).click().build().perform();

}

    By orderSuccessfulMessageLocator = By.xpath("//*[contains(text(),\"Thank you for your purchase!\")]");
    List<WebElement> orderSuccessfulMessage = _driver.findElements(orderSuccessfulMessageLocator);

    public boolean OrderSuccessfulMessageIsDisplayed(){
        return !orderSuccessfulMessage.isEmpty();
    }



}
