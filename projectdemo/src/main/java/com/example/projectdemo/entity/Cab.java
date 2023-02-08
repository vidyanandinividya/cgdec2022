package com.example.projectdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cab {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	private String cabNo;
	private String cartype;
	private String cabName;
	private Float perKmRate;

}
