package com.headfirst.designpatterns.proxy.virtual.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class ServiceProxy implements ServiceProxyInterface {
    String serviceResponse = null;
    public String callService() {

        if (null == serviceResponse) {
            final Thread thread = new Thread(new Runnable() {
                public void run() {
                    serviceResponse = new Service().callService();
                }
            });
            thread.start();
        }
        if (null == serviceResponse) {
            return "Breathe in..Breathe out..It's loading..";
        }
        return serviceResponse;
    }
}
