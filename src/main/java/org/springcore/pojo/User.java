package org.springcore.pojo;

public class User {

    public String userName;
    public String userId;
    public Address address;

    public User() {

    }

    public User(String userName, String userId, Address address) {
        this.userName = userName;
        this.userId = userId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserId : "+getUserId()+", UserName : "+getUserName();
    }

    public void init() throws Exception{
        System.out.println("init method call!!!");
    }

    public void destroy() throws Exception{
        System.out.println("destroy method call!!!");
    }
}
