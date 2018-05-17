package extra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sun.misc.Unsafe;

public class UnsafeTest {

	public static void main(String[] args) {
		UnsafeTest main = new UnsafeTest();
		try {
			main.testObjectCreation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testObjectCreation() throws Exception {

		java.lang.reflect.Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
		theUnsafe.setAccessible(true);
		Unsafe unsafe = (Unsafe) theUnsafe.get(null);

		ClassWithExpensiveConstructor instance = (ClassWithExpensiveConstructor) unsafe.allocateInstance(ClassWithExpensiveConstructor.class);
		assertEquals(0, instance.getValue());
		System.out.println(instance.getValue());
	}

}

class ClassWithExpensiveConstructor {

	private int value = 3;

	private ClassWithExpensiveConstructor() {
		value = doExpensiveLookup();
	}

	private int doExpensiveLookup() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return 1;
	}

	public int getValue() {
		return value;
	}
}
