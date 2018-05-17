package eg01;

public class Warmup7 {

	public static void main(String[] args) {

		int END = Integer.MAX_VALUE;
		int START = END - 100;

		int count = 0;
		for (int i = START; i <= END; i++) {
			count++;
		}
		System.out.println(count);

	}

}
