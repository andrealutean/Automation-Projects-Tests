package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsPage extends HomePage{
    public LaptopsPage(ChromeDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=8\"]")
    private WebElement laptopitem1;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=9\"]")
    private WebElement laptopitem2;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=11\"]")
    private WebElement laptopitem3;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=12\"]")
    private WebElement laptopitem4;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=13\"]")
    private WebElement laptopitem5;
    @FindBy(css="h4[class=\"card-title\"] a[href=\"prod.html?idp_=15\"]")
    private WebElement laptopitem6;
    @FindBy(xpath = "//a[contains(text(), 'Add to cart')]")
    private WebElement addtocart;
    @FindBy(css = "a[onclick=\"byCat('notebook')\"]")
    private WebElement laptopmenu;




    public WebElement getLaptopitem1() {
        return laptopitem1;
    }

    public WebElement getLaptopitem2() {
        return laptopitem2;
    }

    public WebElement getLaptopitem3() {
        return laptopitem3;
    }

    public WebElement getLaptopitem4() {
        return laptopitem4;
    }

    public WebElement getLaptopitem5() {
        return laptopitem5;
    }

    public WebElement getLaptopitem6() {
        return laptopitem6;
    }

    public WebElement getLaptopmenu() {
        return laptopmenu;
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
