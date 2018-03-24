package com.headfirst.designpatterns.proxy.virtual.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class Client implements ClientInterface {

    final ServiceProxyInterface serviceProxy = new ServiceProxy();

    public String callService() {
        final String message = this.serviceProxy.callService();
        return message;
    }
}
