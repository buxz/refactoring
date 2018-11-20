package init.result;

/**
 * Created by SQ_BXZ on 2018-11-20.
 * 影片
 */
public class Movie {
	public static final int 	CHILDRENS = 2 ;
	public static final int 	REGULAR = 0 ;
	public static final int 	NEW_RELEASE= 1 ;

	private String _title;
	private int _priceCode;
	private Price price;

	public Movie(String _title, int _priceCode) {
		this._title = _title;
		setPriceCode(_priceCode);
	}

	public String getTitle() {
		return _title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int _priceCode) {
		switch (_priceCode){
			case REGULAR:
				price = new RegularPrice();
				break;
			case CHILDRENS:
				price = new ChildrensPrice();
				break;
			case NEW_RELEASE:
				price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}

	}

	public  double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented){
		return price.getFrequentRenterPoints(daysRented);
	}
}
