package eg09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car {
	public int wheelsNo;

	public Car() {
		wheelsNo = 4;
	}
}

class Ford extends Car implements Serializable {
	private static final long serialVersionUID = 4693559541436494853L;

	public String color;

	public Ford() {
		this.wheelsNo = 5;
		color = "White";
	}
}

public class Serialize {

	public static void main(String[] args) {
		Ford ford = new Ford();
		ford.wheelsNo = 9;
		ford.color = "Green";
		serialize(ford);

		Ford deserializedFord = deserialize();
		System.out.println(deserializedFord.wheelsNo);
		System.out.println(deserializedFord.color);
	}

	private static void serialize(Ford ford) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myObj"))) {
			oos.writeObject(ford);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Ford deserialize() {
		Ford ford = null;
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("myObj"))) {
			ford = (Ford) oos.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return ford;
	}

}
