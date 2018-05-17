package eg07;

public class MainWithAnimals {
	public static void main(String[] args) {
		Animal obj = new Dog();
		doSomething(obj);
	}

	public static void doSomething(Animal a) {
		System.out.println("Animal version");
		System.out.println(a.x);
		System.out.println(a.getX());
	}

	public static void doSomething(Dog a) {
		System.out.println("Dog version");
		System.out.println(a.x);
		System.out.println(a.getX());
	}

}

class Animal {
	public int x = 3;

	public int getX() {
		return x;
	}
}

class Dog extends Animal {
	public int x = 5;

	public int getX() {
		return x;
	}
}
