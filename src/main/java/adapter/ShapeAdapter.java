package main.java.adapter;

public class ShapeAdapter extends Visibility implements ShapeBasic{
    private ShapeSpecial adaptee;
    public ShapeAdapter(ShapeSpecial adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void draw(){
        adaptee.drawShape();
    }

    public void grow(){
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText(){
        if(adaptee instanceof Triangle){
            return "Triangle";
        }else if(adaptee instanceof ShapeDiamond){
            return "ShapeDiamond";
        }else{
            return "This shape is not supported";
        }
    }

    @Override
    public boolean isVisible(){
        return super.isVisible();
    }
    
}
