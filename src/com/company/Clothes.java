package com.company;

public class Clothes implements Printable {
    private String color;

    public String getColor() {
        return color;
    }

    public Clothes(String color) {
        this.color = color;
    }

    @Override
    public void print() {

    }
}
