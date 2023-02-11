package com.example.projectdemo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Driver extends AbstractUser {
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<TripBooking> tripbooking;
	private String liscenseNo;
	private String location;

}
