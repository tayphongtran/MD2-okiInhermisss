package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c = new Circle();
        c.setColor("green");
        c.setRadius(15);
        System.out.println(c);
        Cylinder c1 = new Cylinder("black", c.getRadius(), c.getArea());
        System.out.println(c1);

    }

}
