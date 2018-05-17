package extra;


public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Goodbye world");
			}
		});
		System.exit(0);
	}
}
