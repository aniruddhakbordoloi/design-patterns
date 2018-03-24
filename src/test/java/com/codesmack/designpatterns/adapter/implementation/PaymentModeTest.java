package com.codesmack.designpatterns.adapter.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha on 28-01-2018.
 */
public class PaymentModeTest {

    @Test
    public void testThatLegacyPaymentSuccessfulViaModernPaymentSystem() throws AdapterException {
        final LegacyPaymentMode legacyPaymentMode = new LegacyPaymentModeImpl();
        final ModernPaymentMode modernPaymentMode = new ModernPaymentModeImpl();
        final String legacyPaymentMsg = legacyPaymentMode.pay();
        final String modernPaymentMsg = modernPaymentMode.pay();
        final ModernPaymentMode modernPaymentModeAdapted = new LegacyToModernPayAdapter(legacyPaymentMode);
        final String modernPaymentMsg_Adapted = modernPaymentModeAdapted.pay();
        assertEquals("Legacy payment failed.", "Paid by cash.", legacyPaymentMsg);
        assertEquals("Modern payment failed.", "Paid by card.", modernPaymentMsg);
        assertEquals("Legacy payment failed when made via the modern system.", "Paid by cash.", modernPaymentMsg_Adapted);
    }
}
