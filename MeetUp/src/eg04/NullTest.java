package eg04;

public class NullTest {

	public static void hello() {
		System.out.println("Hello world!");
	}

	public NullTest getNullTest() {
		return null;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		NullTest nt = new NullTest();
		nt.getNullTest().hello();
	}

}
