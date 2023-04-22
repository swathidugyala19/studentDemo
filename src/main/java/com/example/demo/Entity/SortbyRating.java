package com.example.demo.Entity;

import java.util.Comparator;

public class SortbyRating implements Comparator<Products> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Products a, Products b)
    {

       // return (int) (a.getRating() - b.getRating());
        if(a.getRating() - b.getRating() > 0) return 1;
        if(a.getRating() - b.getRating() < 0) return -1;
        return 0;

    }
}
