package homework;

import java.awt.Color;
import coloring.Colorable;
import coordinates.ColoredPoint;
import products.Pen;

public class Main {

    public static void main(String[] args) {
    	Colorable colorable = new ColoredPoint();
    	System.out.println(colorable);
    	colorable.setColor(Color.BLACK);
    	System.out.println(colorable);
    	
    	Pen pen = new Pen("PenCil", Color.BLUE, 200);
    	System.out.println(pen);
    	pen.setColor(Color.CYAN);
    	System.out.println(pen);
    }
}
