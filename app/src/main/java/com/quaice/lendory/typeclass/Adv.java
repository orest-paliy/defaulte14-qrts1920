package com.quaice.lendory.typeclass;

import java.util.ArrayList;

public class Adv {
    private String name, description, location, currency;
    private int price, area, numberOfRooms, floor;
    private boolean volunteering;
    private ArrayList <String> images;
    private User creator;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int flor) {
        this.floor = floor;
    }

    public boolean isVolunteering() {
        return volunteering;
    }

    public void setVolunteering(boolean volunteering) {
        this.volunteering = volunteering;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Adv(String name, String description, String location, String currency, int price, int area, int numberOfRooms, int floor, boolean volunteering, ArrayList<String> images, User creator) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.currency = currency;
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.volunteering = volunteering;
        this.images = images;
        this.creator = creator;
        if(volunteering)
            this.price = 0;
    }

    public Adv() {
        if(volunteering)
            price = 0;
    }
}