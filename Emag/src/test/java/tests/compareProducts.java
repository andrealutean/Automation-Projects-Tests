package tests;

import PageObjects.SearchAndCompare;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class compareProducts extends BaseTest{

    @Test(description = "Compare two Samsung products")
    public void compare() throws InterruptedException {
        driver.get("https://www.emag.ro/");
        SearchAndCompare searchAndCompare = new SearchAndCompare(driver);
        searchAndCompare.getSearchbar().sendKeys("samsung");
        searchAndCompare.getSearchbar().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        searchAndCompare.getCompare1boxbtn().click();
        Thread.sleep(2000);
        searchAndCompare.getCompare2boxbtn().click();
        searchAndCompare.getComparebtn().click();

    }

}
