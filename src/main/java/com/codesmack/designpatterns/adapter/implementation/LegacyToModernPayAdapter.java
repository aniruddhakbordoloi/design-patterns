package com.codesmack.designpatterns.adapter.implementation;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class LegacyToModernPayAdapter implements ModernPaymentMode {

    private final LegacyPaymentMode legacyPaymentMode;

    public LegacyToModernPayAdapter(final LegacyPaymentMode legacyPaymentMode) throws AdapterException {
        if (null == legacyPaymentMode) {
            throw new AdapterException("Legacy payment could not be converted to modern payment.");
        }
        this.legacyPaymentMode = legacyPaymentMode;
    }

    public String pay() {
        return legacyPaymentMode.pay();
    }
}
