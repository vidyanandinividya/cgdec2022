package com.example.projectdemo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends AbstractUser {
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<TripBooking> tripbooking;
}
