package Garage;

//adding car as a sub class

public class Car extends Vehicle {

	public boolean convertable;

	public Car(int registration, String brand, int value, int noWheels,
			boolean isBroken, boolean convertable) {
		super(registration, brand, value, noWheels, isBroken);
		this.convertable = convertable;

	}
}
