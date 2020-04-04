import java.io.FileReader;
import java.io.BufferedReader;

public class FuelCounter {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String line;
		int total = 0;
		while ((line = br.readLine()) != null){
			total += FuelCalculator.Fuel(Integer.parseInt(line));		
		}
		System.out.println(total);
	}
}