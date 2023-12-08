package org.springcore.autowiring;

public class Employee {

    private String employeeName;
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

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}
