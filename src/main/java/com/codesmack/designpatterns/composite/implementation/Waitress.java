package com.codesmack.designpatterns.composite.implementation;

/**
 * Created by Aniruddha on 27-01-2018.
 */
public class Waitress {

    private Menu allMenus;

    public Waitress(final Menu menus) throws MenuNotFoundException {
        if (null == menus) {
            throw new MenuNotFoundException("Please provide a valid Menu!");
        }
        this.allMenus = menus;
    }

    public void printMenus() {
        allMenus.printMenu();
    }
}
