package com.example.farmershop;

public class DataClass {

    private String name;
    private String phonenumber;
    private String address;
    private String dataImage;

    public DataClass(String name, String phonenumber, String address, String dataImage) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.dataImage = dataImage;
        this.key = key;
    }

    private String key;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String  phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DataClass(String title, String desc, String imageURL){

    }
}