package main.java.adapter;

public class AdapterMain {
    public AdapterMain() {}
    
    public static void main(String[] args) {
        ShapeDrawer drawing = new ShapeDrawer();

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        rec2.changeVisibility();
        Circle cir1 = new Circle();
        Circle cir2 = new Circle();
        cir2.changeVisibility();
        Rectangle rec3 = new Rectangle();

        drawing.addBasicShape(rec1);
        drawing.addBasicShape(rec2);
        drawing.addBasicShape(cir1);
        drawing.addBasicShape(cir2);
        drawing.addBasicShape(rec3);

        drawing.draw();
        System.out.println();

        drawing.grow();
        System.out.println();

        drawing.showVisibility();
    }
}