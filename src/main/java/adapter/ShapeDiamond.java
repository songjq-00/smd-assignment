package main.java.adapter;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored{
    private double a = 2.0;
    private double b = 2.0;
    private String color = "No color";
    private DecimalFormat df2 = new DecimalFormat("#.##");

    public ShapeDiamond(){}

    public ShapeDiamond(String color){
        this.color = setColor(color);
    }

    public ShapeDiamond(double a, double b){
        if(a >= 2.0) {this.a = a;}
        if(b >= 2.0) {this.b = b;}
        //this.a = Math.max(a, 2.0);
        //this.b = Math.max(b, 2.0);
    }

    public ShapeDiamond(double a, double b, String color){
        if(a >= 2.0) {this.a = a;}
        if(b >= 2.0) {this.b = b;}
        //this.a = Math.max(a, 2.0);
        //this.b = Math.max(b, 2.0);
        this.color = setColor(color);
    }

    @Override
    public double calculateArea(){
        return a * b;
    }

    @Override
    public double calculatePerimeter(){
        return 4 * a;
    }

    @Override
    public void drawShape(){
        System.out.println("This is a diamond shape with area: " + df2.format(calculateArea()) + " and perimeter: " + df2.format(calculatePerimeter()) + ". Color: " + getColor());
    }

    public String setColor(String color) {
        return CanBeColored.super.setColor(color);
    }

    @Override
    public String getColor(){
        if(color.equals("No color")){
            return "The shape is not colored";
        }
        return color;
    }
}
