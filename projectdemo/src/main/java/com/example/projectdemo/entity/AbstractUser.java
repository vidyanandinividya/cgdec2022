package com.example.projectdemo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AbstractUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	private String userName;
	//private String role;
	private String password;
	private String mobilenumber;
	private String emailId;
	private Float rating;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;
}
