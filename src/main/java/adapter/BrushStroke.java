package main.java.adapter;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {
    private int thickness;
    private String color = "Yellow";

    public BrushStroke(){
        Random random = new Random();
        this.thickness = random.nextInt(10) + 1;
    }

    @Override
    public void draw(){
        System.out.println("Brush stokes with thickness " + thickness);
    }
    
    @Override
    public void grow(){
        System.out.println("Adding some color... " + getColor());
    }

    @Override
    public String printText(){
        return "Brush Stroke";
    }

    @Override
    public boolean isVisible(){
        return super.isVisible();
    }

    @Override
    public String getColor(){
        if(color.equals("No color")){
            return "Out of color...";
        }
        return color;
    }

    public String setColor(String color){
        this.color = CanBeColored.super.setColor(color);
        return this.color;
    }
}