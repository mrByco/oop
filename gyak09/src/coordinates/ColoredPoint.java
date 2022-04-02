package coordinates;

import java.awt.Color;

import coloring.Colorable;

public class ColoredPoint extends Point implements Colorable{
	
	Color newColor;
	
	public ColoredPoint()
	{
		super(0, 0);
		newColor=defaultColor;
	}
	
	ColoredPoint(Color newColor)
	{
		super(0, 0);
		this.newColor=newColor;
	}

	ColoredPoint(int x, int y, Color newColor)
	{
		super(x, y);
		this.newColor=newColor;
	}
	
	
	@Override
	public String toString()
	{
		return "x: " + x + ", y: " + y + ", color: " + newColor + "\n";
	}
	
	public Color getColor()
	{
		return newColor;
	}
	
	public void setColor(Color givenColor)
	{
		this.newColor=givenColor;
	}

}