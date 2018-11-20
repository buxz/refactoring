package init.result;

/**
 * Created by SQ_BXZ on 2018-11-20.
 */
public class RegularPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return   daysRented >1? 2 : 1;
	}
}
