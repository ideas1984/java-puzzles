package eg08;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Short> mySet = new HashSet<>();

		for (short i = 0; i < 100; i++) {
			mySet.add(i);
			mySet.remove(i - 1);
		}

		System.out.println(mySet.size());
		
	}

}
