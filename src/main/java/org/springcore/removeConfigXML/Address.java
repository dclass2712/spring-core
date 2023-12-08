package org.springcore.removeConfigXML;

public class Address {

    private String cityAddress;

    Address(String cityAddress){
        this.cityAddress = cityAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }
}
