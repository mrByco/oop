package coloring;

import java.awt.Color;

public interface Colorable {

	Color defaultColor = Color.RED;
	
	
	public Color getColor();
	
	public void setColor(Color givenColor);
	

    public static void setDefaultColor(Colorable colorable) {
    	colorable.setColor(Color.RED);
    }
}