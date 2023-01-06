package session3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*String name,owner;
		int regno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the model name");
		name=sc.nextLine();
		System.out.println("Enter the owner name");
		owner=sc.nextLine();
		System.out.println("Enter the reg number");
		regno=sc.nextInt();
		Car obj=new Car(name,owner,regno);
		obj.accelerate();
		obj.startEngine();
		obj.stop();*/
		/*obj.setModelName("BMW");
		obj.setRegNumber(123456);
		obj.setOwner("vidya");
		System.out.println(obj.getModelName());
		System.out.println(obj.getRegNumber());
		System.out.println(obj.getOwner());
		System.out.println(obj);
		obj.setModelName("Audi");
		obj.setRegNumber(34567);
		obj.setOwner("John");*/
		//System.out.println(obj);
		/*Car car[]=new Car[3];
		car[0]=new Car("BMW","John",1234);
		car[1]=new Car("Hundai","Jack",6789);
		car[2]=new Car("Tata","james",1234);
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);*/
		
		Class<Employee> employee=(Class<Employee>) Class.forName("Employee");
		Employee emp=(Employee)employee.newInstance();
		//System.out.println(emp);
		
		
		
		

	}

}
