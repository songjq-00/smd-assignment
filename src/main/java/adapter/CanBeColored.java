package main.java.adapter;

public interface CanBeColored {
    default String setColor(String color) {
        if(color != null &&(color.equals("Blue")||color.equals("Green")||color.equals("Red")||color.equals("Yellow"))) {
            return color;
        }
        return "No color";
    }
    String getColor();
}