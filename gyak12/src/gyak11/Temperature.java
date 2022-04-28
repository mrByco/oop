package gyak11;

public class Temperature {

	private double temperature;

	private Unit unit;

	public static double convTempeature(Temperature temp, Unit toUnit) {
		if (temp.unit.toString().equals(toUnit.toString())) {
			return temp.getTemperature();
		}

		switch (toUnit) {
		case CERLSIUS:
			return temp.getTemperature() + 273.15;
		case KELVIN:
			return temp.getTemperature() - 273.15;
		}
		return 0;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Temperature(double temperature, Unit unit) {
		super();
		this.temperature = temperature;
		this.unit = unit;
	}

	public Temperature(double temperature) {
		this(temperature, Unit.CERLSIUS);
	}

	@Override
	public String toString() {
		return "Temperature [temperature=" + temperature + ", unit=" + unit + "]";
	}

}
