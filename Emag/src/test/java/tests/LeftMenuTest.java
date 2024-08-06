package tests;

import PageObjects.Config;
import PageObjects.LeftMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LeftMenuTest extends  BaseTest{

@Test (description = "Test left menu elements")
    public void LeftMenu() throws InterruptedException {
    driver.get("https://www.emag.ro/");
    LeftMenu leftMenu = new LeftMenu(driver);
    Thread.sleep(2000);
    leftMenu.getAcceptall().click();
    Actions actions = new Actions(driver);

    boolean isPresent  = leftMenu.getClosepromo().isDisplayed();
    if (isPresent){
        leftMenu.getClosepromo().click();
    }



    //test click on second menu from Produse // categoria Laptop,Tablete & Telefoane
    for(int i=0;i<Config.LaptopTableteTelefoane.size();i++){
        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getLaptopTableteTelefoane()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath(Config.LaptopTableteTelefoane.get(i)));
        item.click();
        driver.get("https://www.emag.ro/");
    }

    //test click on second menu from Produse // categoria PC,Periferice & Software
    for(int i=0;i<Config.PCPerifericeSoftware.size();i++){
        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getPCPerifericeSoftware()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.PCPerifericeSoftware.get(i)));

        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");
    }


    //test click on second menu from Produse // categoria TV Audio Video Foto
    for(int i=0;i<Config.TVAudioVideoFoto.size();i++) {

            actions.moveToElement(leftMenu.getProduse()).perform();
            actions.moveToElement(leftMenu.getTVAudioVideoFoto()).perform();
            Thread.sleep(1000);
            WebElement item = driver.findElement(By.xpath
                    (Config.TVAudioVideoFoto.get(i)));

            item.click();
            Thread.sleep(2000);
            driver.get("https://www.emag.ro/");

    }


//test click on second menu from Produse // categoria Electrocasnice si Climatizare
    for(int i=0;i<Config.ElectrocasniceClimatizare.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getElectrocasniceClimatizare()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.ElectrocasniceClimatizare.get(i)));

        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }
    //test click on second menu from Produse // categoria Gaming, Carti si Birotica
    for(int i=0;i<Config.GamingCartiBirotica.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getGamingCartiBirotica()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.GamingCartiBirotica.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

//test click on second menu from Produse // categoria Bacanie
    for(int i=0;i<Config.Bacanie.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getBacanie()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.Bacanie.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

    //test click on second menu from Produse // categoria Fashion
    for(int i=0;i<Config.Fashion.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getFashion()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.Fashion.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

    //test click on second menu from Produse // categoria Ingrijire personala si Cosmetice
    for(int i=0;i<Config.IngrijirepersonalaCosmetice.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getIngrijirepersonalaCosmetice()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.IngrijirepersonalaCosmetice.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

    //test click on second menu from Produse // categoria Casa Gradina, Bricolaj
    for(int i=0;i<Config.CasaGradinaBricolaj.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getCasaGradinaBricolaj()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.CasaGradinaBricolaj.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }


    //test click on second menu from Produse // categoria Sport si Travel
    for(int i=0;i<Config.SportTravel.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getSportTravel()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.SportTravel.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

    //test click on second menu from Produse // categoria Auto & Moto & RCA
    for(int i=0;i<Config.AutoMotoRCA.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getAutoMotoRCA()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.AutoMotoRCA.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }

    //test click on second menu from Produse // categoria Jucarii & Copii & Bebe
    for(int i=0;i<Config.JucariiCopiiBebe.size();i++) {

        actions.moveToElement(leftMenu.getProduse()).perform();
        actions.moveToElement(leftMenu.getJucariiCopiiBebe()).perform();
        Thread.sleep(1000);
        WebElement item = driver.findElement(By.xpath
                (Config.JucariiCopiiBebe.get(i)));
        item.click();
        Thread.sleep(2000);
        driver.get("https://www.emag.ro/");

    }


}
}
