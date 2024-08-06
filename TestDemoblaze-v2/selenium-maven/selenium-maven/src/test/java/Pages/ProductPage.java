package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPage extends BasePage{
    public ProductPage(ChromeDriver driver) {
        super(driver);
    }

    //locators
    By addToCartLocator = By.xpath("//a[contains(text(), 'Add to cart')]");

    //WebElements
    WebElement addToCart = _driver.findElement(addToCartLocator);

    //Methods
    public void AddToCart() throws InterruptedException {
        addToCart.click();

        Thread.sleep(2000);
        Alert alert = _driver.switchTo().alert();
        alert.accept();
    }
}
