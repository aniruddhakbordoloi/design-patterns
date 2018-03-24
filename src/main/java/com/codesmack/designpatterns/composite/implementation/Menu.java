package com.codesmack.designpatterns.composite.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aniruddha on 27-01-2018.
 */
public class Menu {

    private String menuName;
    private String menuDescription;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private List<Menu> menus = new ArrayList<Menu>();


    public Menu(String menuName, String menuDescription) {
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void add(final MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void add(final Menu menu) {
        menus.add(menu);
    }

    public void add(final List<Menu> menus) {
        this.menus.addAll(menus);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void printMenu() {
        System.out.println();
        System.out.println("Welcome to the house of Delicacy! Here are our " + this.menuName + " " + this.menuDescription);
        System.out.println();
        for (final Menu menu : menus) {
            System.out.println("Happy to serve you for : " + menu.getMenuName() + " - " + menu.getMenuDescription());
            System.out.println();
            for (final MenuItem menuItem : menu.getMenuItems()) {
                System.out.println("You can try our " + menuItem.getName());
                System.out.println("- " + menuItem.getDescrption());
            }
            for (final Menu subMenu : menu.getMenus()) {
                System.out.print("Please find our unique delicacies for " + subMenu.getMenuName() + "\n");
                for (final MenuItem subMenuItem : subMenu.getMenuItems()) {
                    System.out.println();
                    System.out.println("Here's our " + subMenuItem.getName());
                    System.out.println("- " + subMenuItem.getDescrption());
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
