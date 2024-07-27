package PageObjects;

import java.util.ArrayList;
import java.util.List;

public class Config {

    public static List<String> items = new ArrayList<>(List.of(new String[]{
            "Sauce Labs Backpack",
            "Sauce Labs Bike Light",
            "Sauce Labs Bolt T-Shirt",
            "Sauce Labs Fleece Jacket",
            "Sauce Labs Onesie",
            "Test.allTheThings() T-Shirt (Red)"}));


    public static List<String> addtocarthomepage = new ArrayList<>(List.of(new String[]{
            "add-to-cart-sauce-labs-backpack",
            "add-to-cart-sauce-labs-bike-light",
            "add-to-cart-sauce-labs-bolt-t-shirt",
            "add-to-cart-sauce-labs-fleece-jacket",
            "add-to-cart-sauce-labs-onesie",
            "add-to-cart-test.allthethings()-t-shirt-(red)"}));

    public static List<String> removefromcarthomepage = new ArrayList<>(List.of(new String[]{
            "remove-sauce-labs-backpack",
            "remove-sauce-labs-bike-light",
            "remove-sauce-labs-bolt-t-shirt",
            "remove-sauce-labs-fleece-jacket",
            "remove-sauce-labs-onesie",
            "remove-test.allthethings()-t-shirt-(red)"}));
}


