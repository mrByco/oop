package coloring;

import java.awt.Color;

public class CustomColor extends Color {
	public CustomColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}
}
