package com.fyndna;

public class PricingInfo {
    public double getPricing(String currency) {
        double conversionValue = 0;
        if(currency.equals("UDS")) {
            conversionValue = 72.04;
        }else if(currency.equals("GBP")) {
            conversionValue = 92.04;
        }
        return conversionValue;
    }
}
