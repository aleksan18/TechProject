package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apartment {

    @Id
    private int apID;
    private String address;
    private String zip;
    private int size;
    private int floor;
    private String has_furniture;
    private int price;

    public Apartment() {
    }

    public Apartment(int apID, String address, String zip, int size, int floor, String has_furniture, int price) {
        this.apID = apID;
        this.address = address;
        this.zip = zip;
        this.size = size;
        this.floor = floor;
        this.has_furniture = has_furniture;
        this.price = price;
    }

    public int getApID() {
        return apID;
    }

    public void setApID(int apID) {
        this.apID = apID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getHas_furniture() {
        return has_furniture;
    }

    public void setHas_furniture(String has_furniture) {
        this.has_furniture = has_furniture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
