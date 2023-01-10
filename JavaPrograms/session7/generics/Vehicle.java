package session7.generics;

public class Vehicle {
	String name;
	public Vehicle(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vehicle [name=" +name+"]";
	}

}
class Bike extends Vehicle
{
	String name;

	public Bike(String name) {
		super(name);
		
	}
	
}
class Car extends Vehicle
{
	String name;

	public Car(String name) {
		super(name);
		
	}
	
}
class Bullet extends Bike
{
	String name;

	public Bullet(String name) {
		super(name);
		
	}
	
}
