package com.headfirst.designpatterns.proxy.virtual.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class ClientTest {

    @Test
    public void thatTheProxyAltersMessagesBasedOnServiceAvailability() throws InterruptedException {
        final ClientInterface client = new Client();
        final String firstServiceResponse = client.callService();
        assertEquals("Assertion Error: The proxy was not invoked.","Breathe in..Breathe out..It's loading..", firstServiceResponse);
        Thread.currentThread().sleep(2000);
        final String secondServiceResponse = client.callService();
        assertEquals("Assertion Error: The proxy was not invoked.","Hey..your order is placed", secondServiceResponse);
    }
}
