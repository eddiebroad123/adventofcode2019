import java.io.FileReader;
import java.io.BufferedReader;

public class FuelCounter2 {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line;
		int total = 0;
		while ((line = br.readLine()) != null){
			total += FuelCalculator2.total_fuel(Integer.parseInt(line));		
		}
		System.out.println(total);
	}
}