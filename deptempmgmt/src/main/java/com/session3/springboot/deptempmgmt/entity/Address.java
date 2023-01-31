package com.session3.springboot.deptempmgmt.entity;

import com.session3.springboot.deptempmgmt.bean.AddressBean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	public Address(AddressBean address)
	{
		addressId=address.getAddressId();
		city=address.getCity();
		state=address.getState();
		pinCode=address.getPinCode();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String city;
	private String state;
	private String pinCode;

}
