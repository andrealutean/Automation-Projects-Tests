import Pages.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class E2ETests extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(E2ETests.class);

    @Test
    public void OrderPhoneAndLaptopTest() throws InterruptedException {
        //define pages
        BasePage basePage = new BasePage(driver);
        LoginPage loginPage;
        HomePage homePage,homePage2,homePage3;
        PhonesPage phonesPage;
        LaptopsPage laptopsPage;
        MonitorsPage monitorsPage;
        ProductPage productPage, productPagelaptop,productPageMonitor;
        CartPage cartPage;
        PlaceOrderPopUpPage placeOrderPopUpPage;


        String username = "test1901";
        String password = "test1";

        //act
        basePage.GoTo(Config.Url);
        loginPage = basePage.Login();
        loginPage.FillInCredentials(username, password);
        loginPage.ClickLogin();

       // basePage.GoTo(Config.Url);
        MonitorsPage monitors = new MonitorsPage(driver);
        monitors.getMonitormenu().click();
        monitors.getMon1().click();
        monitors.getAddtocart();
        basePage.GoTo(Config.Url);
        monitors.getMonitormenu().click();
        monitors.getMon2().click();
        monitors.getAddtocart();

        basePage.GoTo(Config.Url);
        LaptopsPage laptops = new LaptopsPage(driver);
        laptops.getLaptopmenu().click();
        laptops.getLaptopitem1().click();
        laptops.getAddtocart();
        basePage.GoTo(Config.Url);

        laptops.getLaptopmenu().click();
        laptops.getLaptopitem2().click();
        laptops.getAddtocart();
        basePage.GoTo(Config.Url);

        laptops.getLaptopmenu().click();
        laptops.getLaptopitem3().click();
        laptops.getAddtocart();
        basePage.GoTo(Config.Url);

        laptops.getLaptopmenu().click();
        laptops.getLaptopitem4().click();
        laptops.getAddtocart();
        basePage.GoTo(Config.Url);

        laptops.getLaptopmenu().click();
        laptops.getLaptopitem5().click();
        laptops.getAddtocart();
        basePage.GoTo(Config.Url);

        laptops.getLaptopmenu().click();
        laptops.getLaptopitem6().click();
        laptops.getAddtocart();

        basePage.GoTo(Config.Url);
        PhonesPage phones = new PhonesPage(driver);
        phones.getPhonemenu().click();
        phones.getPhoneitem1().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem2().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem3().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem4().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem5().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem6().click();
        phones.getAddtocart();

        basePage.GoTo(Config.Url);
        phones.getPhonemenu().click();
        phones.getPhoneitem7().click();
        phones.getAddtocart();


        basePage.GoTo(Config.Url);
        homePage = new HomePage(driver);
        cartPage=homePage.Cart();
        //plaseaza comanda
        cartPage.PlaceOrder();
        placeOrderPopUpPage = new PlaceOrderPopUpPage(driver);
        placeOrderPopUpPage.FillOrderDetails("Selenium","Romania", "Poplace","1234-1234-1234-1234", 5,2025);

        placeOrderPopUpPage.ClickPurchase();
        placeOrderPopUpPage=new PlaceOrderPopUpPage(driver);

        //assert
        Assert.assertTrue(placeOrderPopUpPage.OrderSuccessfulMessageIsDisplayed());

    }
}
