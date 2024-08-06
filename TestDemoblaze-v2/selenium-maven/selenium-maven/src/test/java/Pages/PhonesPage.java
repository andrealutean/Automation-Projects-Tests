package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPage extends HomePage{
    public PhonesPage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=1\"]")
    private WebElement phoneitem1;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=2\"]")
    private WebElement phoneitem2;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=3\"]")
    private WebElement phoneitem3;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=4\"]")
    private WebElement phoneitem4;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=5\"]")
    private WebElement phoneitem5;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=6\"]")
    private WebElement phoneitem6;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=7\"]")
    private WebElement phoneitem7;
    @FindBy(css = "a[onclick=\"byCat('phone')\"]")
    private WebElement phonemenu;
    @FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
    private WebElement addtocart;

    public WebElement getPhoneitem1() {
        return phoneitem1;
    }

    public WebElement getPhoneitem2() {
        return phoneitem2;
    }

    public WebElement getPhoneitem3() {
        return phoneitem3;
    }

    public WebElement getPhoneitem4() {
        return phoneitem4;
    }

    public WebElement getPhoneitem5() {
        return phoneitem5;
    }

    public WebElement getPhoneitem6() {
        return phoneitem6;
    }

    public WebElement getPhoneitem7() {
        return phoneitem7;
    }

    public WebElement getPhonemenu() {
        return phonemenu;
    }

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
