package com.example.projectdemo.bean;

import java.util.Date;

import com.example.projectdemo.entity.Driver;
import com.example.projectdemo.entity.TripBooking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripBookingBean {

	private Integer tripBookingId;
	private String fromLocation;
	private String toLocation;
	private Date fromDateTime;
	private Date toDateTime;
	private Boolean status;
	private Float distanceinKm ;
	private Float bill;
	private String payment;
	private CustomerBean customer;
	private DriverBean driver;
	public TripBookingBean(TripBooking trip, Boolean buildCustDriver)
    {
    	tripBookingId=trip.getTripBookingId();
    	fromLocation=trip.getFromLocation();
    	toLocation=trip.getToLocation();
    	fromDateTime=trip.getFromDateTime();
    	toDateTime=trip.getToDateTime();
    	status=trip.getStatus();
    	distanceinKm=trip.getDistanceinKm();
    	bill=trip.getBill();
    	payment=trip.getPayment();
    	if(buildCustDriver) {
    		customer = new CustomerBean(trip.getCustomer(), false);
    		driver = new DriverBean(trip.getDriver(), false);
    	}
    	
    }
}
