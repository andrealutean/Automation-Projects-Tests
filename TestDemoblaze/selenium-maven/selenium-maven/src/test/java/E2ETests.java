import Pages.*;
import org.openqa.selenium.interactions.Actions;
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
        ProductPage productPage, productPagelaptop,productPagemonitor;
        CartPage cartPage;
        PlaceOrderPopUpPage placeOrderPopUpPage;


        String username = "test1901";
        String password = "test1";

        //act
        basePage.GoTo(Config.Url);
        loginPage = basePage.Login();
        loginPage.FillInCredentials(username, password);
        loginPage.ClickLogin();

        //create Homepage object
        homePage = new HomePage(basePage._driver);

        //click categoria phone and add to cart
        phonesPage = homePage.OpenPhonesCategory();
        //selectie telefon din lista
        for(int i=0;i<Config.phonesList.size();i++) {
            productPage = phonesPage.ClickOnPhone(Config.phonesList.get(i));
            productPage.AddToCart();
            Thread.sleep(2000);
            //reintoarcere homepage
            basePage.Home().OpenPhonesCategory();
        }
        homePage2 = new HomePage(basePage._driver);
        laptopsPage = homePage2.OpenLaptopsCategory();

        //laptop add loop
        for(int j=0;j<Config.laptopsList.size();j++) {
            productPagelaptop = laptopsPage.ClickOnLaptop(Config.laptopsList.get(j));
            Thread.sleep(3000);
            productPagelaptop.AddToCart();
           // Thread.sleep(3000);
            basePage.Home().OpenLaptopsCategory();

            Thread.sleep(3000);
        }

        homePage3 = new HomePage(basePage._driver);
        monitorsPage = homePage3.OpenMonitorsCategory();
// monitor add to cart loop
        for(int k=0;k<Config.monitorsList.size();k++) {
            productPagemonitor = monitorsPage.ClickOnMonitor(Config.monitorsList.get(k));
            Thread.sleep(3000);
            productPagemonitor.AddToCart();
            // Thread.sleep(3000);
            basePage.Home().OpenMonitorsCategory();

            Thread.sleep(3000);
        }

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
