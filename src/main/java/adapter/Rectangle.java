package main.java.adapter;

public class Rectangle extends Visibility implements ShapeBasic{
    public Rectangle() {}

    @Override
    public void draw(){
        System.out.println("This is a rectangle");
    }

    @Override
    public void grow(){
        System.out.println("Growing the size of the rectangle");
    }

    @Override
    public String printText(){
        return "Rectangle";
    }

    @Override
    public boolean isVisible() {
        return super.isVisible();
    }
}
