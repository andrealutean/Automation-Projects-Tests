package tests;

import PageObjects.LeftMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class test extends BaseTest {

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary btn-emag btn-block yeahIWantThisProduct']")
    private WebElement lista;

    //List<WebElement> elemente = driver.findElements(By.cssSelector("li[class*='rlbItem']"));

    @Test
    public void test() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://www.emag.ro/soundbar/c?ref=hp_menu_quick-nav_190_19&type=category");
        List<WebElement> elemente = driver.findElements(By.xpath("//button[@class='btn btn-sm btn-primary btn-emag btn-block yeahIWantThisProduct']"));
      
       // driver.findElement(By.xpath("//button[contains(text(),'Accept toate ')]")).click();
        for (int i = 0 ; i<elemente.size();i++) {
            elemente.get(i).click();

          //  actions.scrollToElement(elemente.get(i)).click();
            actions.sendKeys(Keys.ESCAPE);
            driver.get("https://www.emag.ro/soundbar/c?ref=hp_menu_quick-nav_190_19&type=category");

            /*if (element.getText().equalsIgnoreCase(numeCautat)) {
                element.click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//i[@class='em em-close hidden-xs gtm_6046yfqs']")).click();
                //break; // Opțional: Poți opri iterația după ce găsești elementul dorit
            }*/
        }
    }
}
