package com.example.projectdemo.bean;

import java.util.ArrayList;
import java.util.List;

import com.example.projectdemo.entity.Address;
import com.example.projectdemo.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class CustomerBean {
	private Integer userId;
	private String userName;
	private String mobilenumber;
	private String emailId;
	private Float rating;
    private Address address;
    private List<TripBookingBean> trips;
    
    public CustomerBean(Customer cust, Boolean buildTrip)
    {
    	userId=cust.getUserId();
    	userName=cust.getUserName();
    	mobilenumber=cust.getMobilenumber();
    	emailId=cust.getMobilenumber();
    	rating=cust.getRating();
    	address=cust.getAddress();
    	
    	if(buildTrip) {
    		trips = new ArrayList<>();
    		cust.getTripbooking().stream().forEach(c-> {
        		trips.add(new TripBookingBean(c, false));
        	});
    	}
    }

}
