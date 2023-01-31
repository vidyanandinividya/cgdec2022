package com.session3.springboot.deptempmgmt.bean;

import com.session3.springboot.deptempmgmt.entity.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBean {

	public AddressBean(Address address) {
		addressId=address.getAddressId();
		city=address.getCity();
		state=address.getState();
		pinCode=address.getPinCode();
		
	}
	private Integer addressId;
	private String city;
	private String state;
	private String pinCode;

}
