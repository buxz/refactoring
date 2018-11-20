package init;

/**
 * Created by SQ_BXZ on 2018-11-20.
 *  表示某个租客足了一部影片
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie _movie, int _daysRented) {
		this._movie = _movie;
		this._daysRented = _daysRented;
	}

	public int get_daysRented() {
		return _daysRented;
	}

	public Movie get_movie() {
		return _movie;
	}
}
