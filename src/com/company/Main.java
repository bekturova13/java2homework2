package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Dress").print();
        createObject("Shirt").print();
        createObject("Jacket").print();
        

    }
    public static Clothes createObject(String className){
       Clothes clothes= null;
        switch (className){
            case "Dress": clothes= new Dress("white ", 85);
            break;
            case "Shirt": clothes =new Shirt ("black ", 48);
            break;
            case "Jacket": clothes= new Jacket ("Brown ", "Cotton");
        }
        return clothes;
    }
}
