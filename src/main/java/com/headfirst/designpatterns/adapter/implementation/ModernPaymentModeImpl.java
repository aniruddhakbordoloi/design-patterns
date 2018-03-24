package com.headfirst.designpatterns.adapter.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class ModernPaymentModeImpl implements ModernPaymentMode {
    public String pay() {
        return "Paid by card.";
    }
}
