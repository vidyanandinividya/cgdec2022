package session5;

import java.util.ArrayList;
import java.util.List;

public class FlightManager {
		private List<FlightOperations> listVendors=null;
		public FlightManager()
		{
			listVendors=new ArrayList<>();
		}
		public void addVendor(FlightOperations fo)
		{
			this.listVendors.add(fo);
		}
		public List<FlightOperations> getListVendors()
		{
			return listVendors;
		}

}
