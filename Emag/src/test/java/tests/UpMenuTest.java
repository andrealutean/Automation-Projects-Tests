package tests;

import PageObjects.UpMenu;
import org.testng.annotations.Test;

public class UpMenuTest extends BaseTest{

    @Test(description = "Test upmenu elements")
    public void UpMenu()  {
        driver.get("https://www.emag.ro/");
        UpMenu upMenu = new UpMenu(driver);

        upMenu.getGeniusDealsBtn().click();
        driver.get("https://www.emag.ro/");
        upMenu.getEasyBuyBackBtn().click();
        driver.get("https://www.emag.ro/");
        upMenu.getRablaBtn().click();
        driver.get("https://www.emag.ro/");
        upMenu.getGeniusBtn().click();
        driver.get("https://www.emag.ro/");
        upMenu.getResigilateBtn().click();
        driver.get("https://www.emag.ro/");
        upMenu.getOferteleEmagBtn().click();
        driver.get("https://www.emag.ro/");

    }


}
