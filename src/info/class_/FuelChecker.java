package info.class_;

import java.util.Random;

public class FuelChecker {
	
	public static int ReturnFulLevel(){
		Random r = new Random();
		int randomValue = r.nextInt(100);
		return randomValue;
	}
}
