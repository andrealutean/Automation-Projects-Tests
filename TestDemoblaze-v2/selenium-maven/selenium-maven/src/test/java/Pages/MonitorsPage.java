package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MonitorsPage extends HomePage {
    public MonitorsPage(ChromeDriver driver) {
        super(driver);

        PageFactory.initElements(driver, this);

    }


    // test fara Paul
    @FindBy(css = "a[onclick=\"byCat('monitor')\"]")
    private WebElement monitormenu;

    public WebElement getMonitormenu() {
        return monitormenu;
    }

    @FindBy(css = "img[src=\"imgs/apple_cinema.jpg\"]")
    private WebElement mon1;

    public WebElement getMon1() {
        return mon1;
    }

    @FindBy(css = "img[src=\"imgs/asusm.jpg\"]")
    private WebElement mon2;


    public WebElement getMon2() {
        return mon2;
    }


    @FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
    private WebElement addtocart;

    public void getAddtocart() throws InterruptedException {
        try {
            actions.moveToElement(addtocart).click().build().perform();
        } catch (NoSuchElementException ex) {
            addtocart.click();
        }
        // addtocart.click();
        Thread.sleep(3000);
        Alert alert = _driver.switchTo().alert();
        alert.accept();

    }

}
