package org.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private String employeeName;

    //this autowired will find the bean name with "employeeAddress" and inject them (property injection)
    @Autowired //@Autowired annotation is use for Automatic dependency injection in spring bean, its part of Inversion of control container. Used on setter, constructor or on constructor
    @Qualifier("employeeAddress1") //The @Qualifier annotation in Spring is used to differentiate a bean among the same type of bean objects. If we have more than one bean of the same type and want to wire only one of them then use the @Qualifier annotation along with @Autowired
    private Address employeeAddress;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

//    @Autowired //this will find the bean of Address name as "address" and inject them (setter injection)
    public void setEmployeeAddress(Address address) {
        this.employeeAddress = address;
    }

    public Employee() {
    }

    public Employee(String employeeName, Address employeeAddress1) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}
