package session5;

public class InterfaceDemo {
	private static FlightManager flightManager=new FlightManager();

	public static void main(String[] args) {
		loadVendors();
		System.out.println("Get All Flights");
		for(FlightOperations fo:flightManager.getListVendors())
		{
			fo.getAllAvailableFlights();
		}
		System.out.println("Do Booking");
		for(FlightOperations fo:flightManager.getListVendors())
		{
			fo.booking();
		}
		

	}
	public static void loadVendors()
	{
		flightManager.addVendor(new AirIndia());
		flightManager.addVendor(new Emirates());
	}

}
