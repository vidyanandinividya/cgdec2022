package session8;

import java.util.List;

public class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;
	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

}
