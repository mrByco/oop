package gyak11;

public class TempTest {

	public static void main(String[] args) {
		Temperature[] temps = new Temperature[] {
				new Temperature(15.0, Unit.CERLSIUS),
				new Temperature(300, Unit.KELVIN),
				new Temperature(58.2614336710285),
				new Temperature(86.99428465068647)
		};
		PrintTemps(temps);
	}
	
	public static void PrintTemps(Temperature[] temps) {
		for (Temperature temp : temps) {
			System.out.println(temp);
		}
	}
}
