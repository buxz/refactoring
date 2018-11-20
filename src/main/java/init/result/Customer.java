package init.result;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by SQ_BXZ on 2018-11-20.
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
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = ((Rental) rentals.nextElement());
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		Enumeration rentals = _rentals.elements();
		String result = "<h1>Rentals  for<em> " + getName() + "</em></h1><p>\n";
		while (rentals.hasMoreElements()) {
			Rental each = ((Rental) rentals.nextElement());
			// show figures for this rental
			result += each.getMovie().getTitle() + ":" +
					String.valueOf(each.getCharge()) + "<br>\n";
		}
		// add footer lines
		result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
		result += "On this rental you earned <em>" +
				String.valueOf(getTotalFrequentRenterPoints())
				+ "</em> frequent renter points<p>";
		return result;
	}


	public double getTotalCharge(){
		double result = 0 ;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = ((Rental) rentals.nextElement());
			result += each.getCharge();
		}
		return result;
	}

	public double getTotalFrequentRenterPoints(){
		double result = 0 ;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = ((Rental) rentals.nextElement());
			result = each.getFrequentRenterPoints();
		}
		return result;
	}





}
