package genericLiberary;

import java.util.Random;

public class UtilityMethods {
	
	public int getRandomNumber() {
		Random r = new Random();
		return r.nextInt(10000);
	}

}
