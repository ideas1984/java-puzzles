package eg12;

import java.lang.reflect.Field;

public class Immutable {

	public static void main(String[] args) throws Exception {
		String someString = new String("IMMUTABLE");

		Field field = Class.forName("java.lang.String").getDeclaredField("value");
		field.setAccessible(true);
		char[] value = (char[]) field.get(someString);
		String anotherString = "MUTABLE!!";

		for (int i = 0; i < value.length; i++) {
			value[i] = anotherString.toCharArray()[i];
		}

		System.out.println(someString);
	}
}
