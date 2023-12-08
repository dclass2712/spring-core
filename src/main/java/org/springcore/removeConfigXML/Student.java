package org.springcore.removeConfigXML;

public class Student {

    private String name;

    private Address address;

    Student(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String printName(){
        System.out.println("print student name" +this.name+" and address is "+this.address.getCityAddress());
        return this.name;
    }
}
