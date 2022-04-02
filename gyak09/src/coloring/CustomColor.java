package coloring;

import java.awt.Color;

public class CustomColor extends Color {
	public CustomColor(Color color) {
		super(color.getRed(), color.getGreen(), color.getBlue());
	}
	
	@Override
	public String toString() {
		if (this.equals(WHITE)) return "feh�r";
		if (this.equals(LIGHT_GRAY)) return "vil�gos sz�rke";
		if (this.equals(GRAY)) return "sz�rke";
		if (this.equals(DARK_GRAY)) return "s�t�t sz�rke";
		if (this.equals(BLACK)) return "fekete";
		if (this.equals(PINK)) return "pink";
		if (this.equals(ORANGE)) return "narancs";
		if (this.equals(YELLOW)) return "s�rga";
		if (this.equals(GREEN)) return "z�ld";
		if (this.equals(MAGENTA)) return "magenta";
		if (this.equals(CYAN)) return "cyan";
		if (this.equals(BLUE)) return "k�k";
		return "?";
	}
}