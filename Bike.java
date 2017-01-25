package Garage;

public class Bike extends Vehicle {
	public int cc;
	public String type;

	public Bike(int registration, String brand, int value, int noWheels,
			boolean isBroken, int cc, String type) {
		super(registration, brand, value, noWheels, isBroken);
		this.cc = cc;
		this.type = type;
	}


}
