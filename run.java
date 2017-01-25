package Garage;

public class run {
	
public static void main(String[] args){
	Garage tarygarage=new Garage();
	
	Car car1 = new Car(1, "Renault", 500, 4, true, false);
	Car car2 = new Car(2, "Rover", 700, 4, true, true);
	Car car3 = new Car(3, "Robin", 300, 3, false, false);
	Bike bike1 = new Bike(4, "Triumph", 400, 2, true, 600, "TT");
	Bike bike2 = new Bike(5, "Suzuki", 800, 2, true, 1000, "GSXR");
	Truck truck1 = new Truck(6, "Dodge", 1500, 4, false, "Class 4");
	Truck truck2 = new Truck(7, "Volvo", 2000, 6, true, "Class 7");
	
	tarygarage.add(car1);
	tarygarage.add(car2);
	tarygarage.add(car3);
	tarygarage.add(bike1);
	tarygarage.add(bike2);
	tarygarage.add(truck1);
	tarygarage.add(truck2);
	
	
	
	
	
	

	
	
	tarygarage.cost();
	
	
	
	
}
}
