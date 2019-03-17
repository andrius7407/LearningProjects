interface Driveable {
	public void turnOn(String name);
	public void drive();
}

class Vehicle implements Driveable{
	
	public void turnOn(String name) {
		System.out.println("Engine of a " + name + " is turned on.");
	}
	
	public void drive() {
		System.out.println("Drive!");
	}
}

class Car extends Vehicle {
}	

class Truck extends Vehicle {	
}

class Bicycle extends Vehicle {
	public void turnOn(String name) {
		System.out.println("Sit on a " + name + ".");
	}
}	
public class TestVehicle {
	
	public static void main(String[] args) {
		
		String carName = "car";
		String truckName = "truck";
		String bicycleName = "bicycle";
		
		
		Car c = new Car();
		c.turnOn(carName);
		c.drive();
		
		Truck t = new Truck();
		t.turnOn(truckName);
		t.drive();
		
		Bicycle b = new Bicycle();
		b.turnOn(bicycleName);
		b.drive();
	}
}
