package com.example.projectdemo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tripBookingId;
	private String fromLocation;
	private String toLocation;
	private Date fromDateTime;
	private Date toDateTime;
	private Boolean status;
	private Float distanceinKm ;
	private Float bill;
	private String payment;
	@ManyToOne
    @JoinColumn(name="customerId", nullable=false)
    private Customer customer;
	@ManyToOne
    @JoinColumn(name="driverId", nullable=false)
    private Driver driver;

}
