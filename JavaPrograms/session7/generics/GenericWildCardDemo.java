package session7.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCardDemo {
	
	//upper bound
	public static void deleteBike(List<? extends Bike> l1,Bike b1)
	{
		l1.remove(b1);
		System.out.println("Bike removed");
	}
	//Lower bound
	public static void addBike(List<? super Bullet> l2)
	{
		l2.add(new Bullet("ckassic"));
		System.out.println("Bike Added");
	}
	//Wild card
	public static void printItems(List<?> list)
	{
		for(Object i:list)
		{
			System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		List<Vehicle> v1=new ArrayList<Vehicle>();
		List<Bullet> bullet=new ArrayList<>();
		List<Bike> bike=new ArrayList<>();
		List<Car> car=new ArrayList<>();
		addBike(bike);
		addBike(bullet);
		addBike(v1);
		//addBike(car);
		printItems(car);
		printItems(v1);
		printItems(bike);
		printItems(bullet);
		Bullet b=bullet.get(0);
		Bike b1=bike.get(0);
		Vehicle v=v1.get(0);
		deleteBike(bike, b1);
		deleteBike(bullet, b);
		//deleteBike(v1,v);

	}

}
