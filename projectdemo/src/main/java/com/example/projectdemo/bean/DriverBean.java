package com.example.projectdemo.bean;

import java.util.ArrayList;
import java.util.List;

import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;
import com.example.projectdemo.entity.Driver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverBean {
	private Integer userId;
	private String userName;
	private String mobilenumber;
	private String emailId;
	private Float rating;
	private String liscenseNo;
	private String location;
    private Address address;
    private List<TripBookingBean> trips;
    public DriverBean(Driver driver,Boolean buildTrip)
    {
    	userId=driver.getUserId();
    	userName=driver.getUserName();
    	mobilenumber=driver.getMobilenumber();
    	emailId=driver.getMobilenumber();
    	rating=driver.getRating();
    	address=driver.getAddress();
    	liscenseNo = driver.getLiscenseNo();
    	location=driver.getLocation();
    	if(buildTrip) {
    		trips = new ArrayList<>();
    		driver.getTripbooking().stream().forEach(d-> {
        		trips.add(new TripBookingBean(d, false));
        	});
    	}
    	
    }
}
