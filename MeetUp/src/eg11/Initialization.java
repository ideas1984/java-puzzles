package eg11;

public class Initialization {
	
	public static final Initialization instance = new Initialization();
	
	private static final Boolean BOOL_VAL = true;
	
	private final Boolean field = BOOL_VAL;

	private Initialization() {}

	public Boolean getField() {
		return field;
	}

	public static void main(String[] args) {
		if(Initialization.instance.getField()) {
			System.out.println("T R U E");
		} else {
			System.out.println("F A L S E");
		}
	}

}
