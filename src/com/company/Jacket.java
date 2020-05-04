package com.company;

public class Jacket extends Clothes implements Printable{
    private String material;

    public Jacket(String color, String material) {
        super(color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public void print() {
        System.out.println("Color " + getColor() + "material " +getMaterial());

    }
}
