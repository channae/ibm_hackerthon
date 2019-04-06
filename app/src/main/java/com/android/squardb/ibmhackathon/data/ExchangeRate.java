package com.android.squardb.ibmhackathon.data;

public class ExchangeRate {

    private int id;
    private String countryCode;
    private double rate;
    private double serviceFee;

    public ExchangeRate(int id, String countryCode, double rate, double serviceFee) {
        this.id = id;
        this.countryCode = countryCode;
        this.rate = rate;
        this.serviceFee = serviceFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }
}
