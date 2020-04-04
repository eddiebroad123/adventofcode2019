public class FuelCalculator2 {
	public static int fuel( int mass) {
		return mass / 3 - 2;
	}
	
	public static int total_fuel(int mass) {
		if (fuel(mass) < 1){
			return 0;
		} else {
			return fuel(mass) + total_fuel(fuel(mass));
		}
	}
}