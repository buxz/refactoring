package init.result;

/**
 * Created by SQ_BXZ on 2018-11-20.
 */
public class NewReleasePrice extends Price {
	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
}
