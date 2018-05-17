package eg05;

public class PingPong {
	public static synchronized void main(String[] a) {
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				pong();
			}
		};
		t.run();
		System.out.println("Ping");
	}

	static synchronized void pong() {
		System.out.println("Pong");
	}
}
