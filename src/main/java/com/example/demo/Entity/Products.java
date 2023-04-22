package com.example.demo.Entity;

public class Products implements Comparable<Products>{

    private String title;
    private String brand;
    private Double rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Products o) {
        if(this.getRating() > o.getRating() ) return 1;
        if(this.getRating() < o.getRating() ) return -1;
        return 0;
    }
}
