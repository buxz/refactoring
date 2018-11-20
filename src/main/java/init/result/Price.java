package init.result;

/**
 *
 * Created by SQ_BXZ on 2018-11-20.
 *
 */
public abstract class Price {

	abstract int getPriceCode();

	abstract  double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented){
		return 1 ;
	}

}
