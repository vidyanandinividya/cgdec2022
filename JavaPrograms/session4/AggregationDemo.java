package session4;

import java.util.ArrayList;
import java.util.List;

//Sportsperson class

class SportPerson
{
	private String personName;

	public SportPerson(String personName) {
		super();
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}
	
}

class Country
{
	List<SportPerson> sportPerson;
	private String countryName;

	public Country(String countryName) {
		super();
		this.countryName = countryName;
	}

	public List<String> getSportPerson() {
		List<SportPerson> listSportPersons=this.sportPerson;
		List<String> names=new ArrayList<>();
		for(SportPerson sportPerson:listSportPersons)
		{
			names.add(sportPerson.getPersonName());
		}
		return names;
	}

	public void setSportPerson(List<SportPerson> sportPerson) {
		this.sportPerson = sportPerson;
	}

	public String getCountryName() {
		return countryName;
	}

}
public class AggregationDemo {

	public static void main(String[] args) {
		//create three sportsperson object
		SportPerson dhoni=new SportPerson("Dhoni");
		SportPerson kohli=new SportPerson("Kohli");
		SportPerson rishab=new SportPerson("Rishab");
		//create a country
		Country india=new Country("India");
		//Create a arraylist and add the sportsperson
		List<SportPerson> listSportPersons=new ArrayList<>();
		listSportPersons.add(rishab);
		listSportPersons.add(dhoni);
		listSportPersons.add(kohli);
		//add this list to country class
		india.setSportPerson(listSportPersons);
		
		//Has-a association between country and sportsperson
		System.out.println("The sports people from country "
		+india.getCountryName()+" are: "+ india.getSportPerson());
		
		

	}

}
