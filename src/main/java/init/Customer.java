package init;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by SQ_BXZ on 2018-11-20.
 * 顾客
 */
public class Customer {
	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String _name) {
		this._name = _name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = ((Rental) rentals.nextElement());

			// datermine amounts for each line
			switch (each.get_movie().get_priceCode()) {
				case Movie.REGULAR:
					thisAmount += 2;
					if (each.get_daysRented() > 2) {
						thisAmount += (each.get_daysRented() - 2) * 1.5;
					}
					break;
				case Movie.NEW_RELEASE:
					thisAmount += each.get_daysRented() * 3;
					break;
				case Movie.CHILDRENS:
					thisAmount += 1.5;
					if (each.get_daysRented() > 3)
						thisAmount += (each.get_daysRented() - 3) * 1.5;
					break;
			}
			// add frequent renter points
			frequentRenterPoints ++;

			// add bonus for a  two day new release rental
			if (each.get_movie().get_priceCode() == Movie.NEW_RELEASE && each.get_daysRented() >1 )
				frequentRenterPoints ++;

			// show figures for this rental
			result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;

	}
}
