package main.java.adapter;

public class ShapeDrawer extends Drawing<ShapeBasic> {
    @Override
    public void draw() {
        if(getBasicShapes().isEmpty()){
            System.out.println("Drawing is empty!");
            return;
        }
        for(ShapeBasic shape : getBasicShapes()){
            shape.draw();
        }
    }

    public void grow(){
        if(getBasicShapes().isEmpty()){
            System.out.println("Drawing is empty!");
            return;
        }
        for(ShapeBasic shape : getBasicShapes()){
            shape.grow();
        }
    }

    public void showVisibility(){
        if(getBasicShapes().isEmpty()){
            System.out.println("Drawing is empty!");
            return;
        }

        int count = 1;
        for(ShapeBasic shape : getBasicShapes()){
            String status;
            if(shape.isVisible()){
                status = "visible";
            }else{
                status = "in the background";
            }
            System.out.println(count + ". shape is" + status +": " + shape.printText());
            count++;
        }
    System.out.println("Total number of shapes: " + getBasicShapes().size());
    }
}
