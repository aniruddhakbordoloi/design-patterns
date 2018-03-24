package com.headfirst.designpatterns.proxy.virtual.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class Service implements ServiceInterface {
    public String callService() {
        return "Hey..your order is placed";
    }
}
