package Garage;

public abstract class Vehicle {
	// things all Vehicles have
	public int registration;
	public String brand;
	public int value;
	public int noWheels;
	public boolean isBroken;

	// setting all values to the object
	public Vehicle(int registration, String brand, int value, int noWheels,
			boolean isBroken) {
		this.registration = registration;
		this.brand = brand;
		this.value = value;
		this.noWheels = noWheels;
		this.isBroken = isBroken;

	}

}