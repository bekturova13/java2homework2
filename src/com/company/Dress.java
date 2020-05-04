package com.company;

public class Dress extends Clothes implements Printable {
    private int length;

    public Dress(String color, int length) {
        super(color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void print() {
        System.out.println("Color "+ getColor() + "length " + getLength());

    }
}
