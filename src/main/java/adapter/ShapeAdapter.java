package main.java.adapter;

public class ShapeAdapter extends Visibility implements ShapeBasic{
    private ShapeSpecial shape;
    public ShapeAdapter(ShapeSpecial shape){
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.drawShape();
    }

    public void grow(){
        System.out.println(printText() + ", cannot grow");
    }

    @Override
    public String printText(){
        if(shape instanceof Triangle){
            return "Triangle";
        }else if(shape instanceof ShapeDiamond){
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
