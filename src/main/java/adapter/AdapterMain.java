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


        Triangle tri1 = new Triangle("Other color");
        ShapeDiamond dia1 = new ShapeDiamond("Blue");

        ShapeDiamond dia2 = new ShapeDiamond("somethingElse");
        ShapeAdapter adapterdia2 = new ShapeAdapter(dia2);
        adapterdia2.changeVisibility();

        ShapeDiamond dia3 = new ShapeDiamond(4.0, 4.0, "Yellow");
        ShapeAdapter adapterdia3 = new ShapeAdapter(dia3);
        adapterdia3.changeVisibility();

        Triangle tri2 = new Triangle(5.0, 5.0, 5.0, "Green");
        ShapeAdapter adaptertri2 = new ShapeAdapter(tri2);
        adaptertri2.changeVisibility();
        
        ShapeDiamond dia4 = new ShapeDiamond(1.0, 1.0, "Red");
        BrushStroke bs1 = new BrushStroke();
        bs1.changeVisibility();
        BrushStroke bs2 = new BrushStroke();
        bs2.setColor("someColor");
        BrushStroke bs3 = new BrushStroke();
        bs3.setColor("Green");

        drawing.addBasicShape(new ShapeAdapter(tri1));
        drawing.addBasicShape(new ShapeAdapter(dia1));
        drawing.addBasicShape(adapterdia2);
        drawing.addBasicShape(adapterdia3);
        drawing.addBasicShape(adaptertri2);
        drawing.addBasicShape(new ShapeAdapter(dia4));
        drawing.addBasicShape(bs1);
        drawing.addBasicShape(bs2);
        drawing.addBasicShape(bs3);

        drawing.draw();
        System.out.println();

        drawing.grow();
        System.out.println();

        drawing.showVisibility();
    }
}