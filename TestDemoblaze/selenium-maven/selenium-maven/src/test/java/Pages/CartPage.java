package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By placeOrderLocator = By.xpath("//button[contains(text(), 'Place Order')]");

    //WebElements
    WebElement placeOrderButton = _driver.findElement(placeOrderLocator);

    //Methods
    public void PlaceOrder() throws InterruptedException {
        Thread.sleep(1000);
        placeOrderButton.click();

        //return new PlaceOrderPopUpPage(_driver);
    }
}
