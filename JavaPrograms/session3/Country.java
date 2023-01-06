package session3;

public class Country {
	static int countryCounter;
	String name;
	int dummyCounter;
	static int count;
	
	public Country()
	{
		++count;
		
	}

	public static void main(String[] args) {
		Country obj=new Country();
		Country obj1=new Country();
		Country obj2=new Country();
		Country obj3=new Country();
		Country obj4=new Country();
		
		obj.name="India";
		obj.dummyCounter=1;
		++obj.countryCounter;
		
		obj1.name="Italy";
		obj1.dummyCounter=1;
		++obj1.countryCounter;
		System.out.println("obj.countryCounter= "+obj.countryCounter);
		System.out.println("obj1.countryCounter= "+obj1.countryCounter);
		System.out.println("Country.countryCounter= "+Country.countryCounter);
		System.out.println("The number of instances created for country class:"
				+ count);
		
	}

}
