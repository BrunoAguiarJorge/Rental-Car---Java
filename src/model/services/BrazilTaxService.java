package model.services;

public class BrazilTaxService implements TaxService {
	
	//Double with capital D is type class and double with small d is type of primitivo.
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
