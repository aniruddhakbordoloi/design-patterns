package com.codesmack.designpatterns.composite.implementation;

/**
 * Created by Aniruddha on 27-01-2018.
 */
public class MenuItem {

    private final String descrption;
    private final String name;

    public MenuItem(final String name, final String description) {
        this.name = name;
        this.descrption = description;
    }

    public String getDescrption() {
        return descrption;
    }

    public String getName() {
        return name;
    }
}
