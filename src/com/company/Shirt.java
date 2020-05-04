package com.company;

public class Shirt extends Clothes implements Printable {
    private int size;

    public Shirt(String color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    @Override
    public void print() {
        System.out.println( "Color " + getColor() + "size " + getSize());

    }
}
