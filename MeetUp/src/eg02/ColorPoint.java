package eg02;

class Point {
	private final int x, y;
	private final String color;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		color = makeColor();
	}

	protected String makeColor() {
		return "[" + x + "," + y + "]";
	}

	public final String toString() {
		return color;
	}
}

public class ColorPoint extends Point {
	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	protected String makeColor() {
		return super.makeColor() + ":" + color;
	}

	public static void main(String[] args) {
		System.out.println(new ColorPoint(50, 200, "purple"));
	}
}
