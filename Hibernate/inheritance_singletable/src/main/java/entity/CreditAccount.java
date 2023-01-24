package entity;

import javax.persistence.Entity;

@Entity
public class CreditAccount extends Account {
	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	

}
