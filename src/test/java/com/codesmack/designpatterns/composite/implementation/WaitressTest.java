package com.codesmack.designpatterns.composite.implementation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aniruddha on 27-01-2018.
 */
public class WaitressTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    //Please read as test_thatWaitressPrintsMenus
    @Test
    public void thatWaitressPrintsMenus() throws MenuNotFoundException {
        final List<Menu> menus = new ArrayList<Menu>();
        menus.add(cakeMenu());
        menus.add(pizzaMenu());
        final Menu allMenus = new Menu("All menu template.", "A collection of food delicacies..");
        allMenus.add(menus);
        final Waitress waitress = new Waitress(allMenus);
        waitress.printMenus();
    }

    //Please read as test_thatWaitressRejectsInvalidMenu
    @Test
    public void thatWaitressRejectsInvalidMenu() throws MenuNotFoundException {
        expectedException.expect(MenuNotFoundException.class);
        expectedException.expectMessage("Please provide a valid Menu!");
        final Waitress waitress = new Waitress(null);
        waitress.printMenus();
    }

    private Menu pizzaMenu() {
        final Menu pizzas = new Menu("Pizza Menu", "Menu for Pizzas");
        pizzas.add(italianPizza());
        pizzas.add(americanPizza());
        return pizzas;
    }

    private Menu americanPizza() {
        final Menu americanPizza = new Menu("Pizzeria Americana", "Have an American bite!");
        final MenuItem chickenPizza = new MenuItem("American Chicken Pizza", "From the house of Latin America - Zesty chicken lovers!");
        final MenuItem vegPizza = new MenuItem("American Veg Pizza", "Spices of Latin America engulfed in the aromatic fragrance of each bite!");
        americanPizza.add(chickenPizza);
        americanPizza.add(vegPizza);
        return americanPizza;
    }

    private Menu italianPizza() {
        final Menu italianPizza = new Menu("Pizzeria Italiana", "Have an Italian bite!");
        final MenuItem chickenPizza = new MenuItem("Italian Chicken Pizza", "A must have for the chicken lovers!");
        final MenuItem vegPizza = new MenuItem("Italian Veg Pizza", "Enjoy the veg delicacy with a thin crust and a basil topping.");
        italianPizza.add(chickenPizza);
        italianPizza.add(vegPizza);
        return italianPizza;
    }

    private Menu cakeMenu() {
        final Menu cakes = new Menu("Cake Menu", "Menu for Cakes");
        final MenuItem vanillaCake = new MenuItem("Vanilla cake", "Delicious Vanilla topping cake.");
        final MenuItem chocolateCake = new MenuItem("Chocolate", "Replenish your taste buds with hot chocolate topping on this cake.");
        cakes.add(vanillaCake);
        cakes.add(chocolateCake);
        return cakes;
    }
}
