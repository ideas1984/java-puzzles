package eg03;

import java.util.HashSet;
import java.util.Set;

public class Name {
	private final String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Name)) {
			return false;
		}
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}
	
	public static void main(String[] args) {
		Set<Name> set = new HashSet<Name>();
		set.add(new Name("Jon", "Snow"));

		System.out.println(set.contains(new Name("Jon", "Snow")));

	}

}
