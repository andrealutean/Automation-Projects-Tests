package tests;

import PageObjects.UpMenu;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {


    @Test(description = "Search an product")
    public void Search() {
        driver.get("https://www.emag.ro/");
        UpMenu upMenu = new UpMenu(driver);
        upMenu.getSearchbar().sendKeys("samsung");
        upMenu.getSearchbar().sendKeys(Keys.ENTER);


    }


}
