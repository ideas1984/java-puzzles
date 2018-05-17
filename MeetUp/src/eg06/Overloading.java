package eg06;

public class Overloading {

	public static void main(String[] args) {
		myMethod(223);
	}

	public static void myMethod(Integer p) {
		System.out.println("Integer");
	}

	public static void myMethod(int p) {
		System.out.println("int");
	}
	
	public static void myMethod(long p) {
		System.out.println("long");
	}

	public static void myMethod(Integer... p) {
		System.out.println("Integer ...");
	}
	
	public static void myMethod(int... p) {
		System.out.println("int ...");
	}
	
	public static void myMethod(Object p) {
		System.out.println("Object");
	}
}
