package eg10;

public class Reluctant {

	@SuppressWarnings("unused")
	private Reluctant internalInstance = new Reluctant();

	public Reluctant() throws Exception {
		throw new Exception("exception in constructor");
	}

	public static void main(String[] args) {
		try {
			new Reluctant();
			System.out.println("Surprise!");
		} catch (Exception ex) {
			System.out.println("Exception catched");
		}
	}

}
