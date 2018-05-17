package eg14;

import java.util.Random;

public class Hard {

	public static void main(String[] args) {

		Random r = new Random();
		int myInt = r.nextInt();
		if (Math.round(myInt) != myInt) {
			System.out.println("Not the same");
		} else {
			System.out.println("Same object");
		}

	}

}
