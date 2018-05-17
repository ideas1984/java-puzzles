package eg13;


public class Outer {
	public static void main(String[] args) throws Exception {
		new Outer().greetWorld();
	}

	private void greetWorld() throws Exception {
		System.out.println(Inner.class.newInstance());
	}

	public class Inner {

		public Inner(String a) {

		}

		public String toString() {
			return "Hello world";
		}
	}

}
