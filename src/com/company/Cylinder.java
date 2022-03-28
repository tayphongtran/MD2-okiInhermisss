package com.company;

 class Cylinder extends  Circle{
    private double height;


     public Cylinder() {
         super();
         height = 5.9;

     }
     public Cylinder(double height){
         super();
         this.height = height;
     }

     public Cylinder(String color, double radius, double height) {
         super(color, radius);
         this.height = height;
     }

     public double getHeight(){
         return  height;
     }
     public double getThetic(){
         return getHeight()*Math.PI;
     }

     @Override
     public String toString() {
         return "Cylinder{" + getThetic() +
                 "height=" + height +
                 '}';
     }
 }
