package org.springcore.autowiring;

public class Address {

    private String addressCity;
    private String addressPin;

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPin() {
        return addressPin;
    }

    public void setAddressPin(String addressPin) {
        this.addressPin = addressPin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressCity='" + addressCity + '\'' +
                ", addressPin='" + addressPin + '\'' +
                '}';
    }
}

