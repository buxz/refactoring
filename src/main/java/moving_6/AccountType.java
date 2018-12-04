package moving_6;

/**
 * Created by SQ_BXZ on 2018-12-04.
 */
public class AccountType {

    private  double _interestRate;

    public double get_interestRate() {
        return _interestRate;
    }

    public void set_interestRate(double _interestRate) {
        this._interestRate = _interestRate;
    }

    boolean isPremium(){
        return false;
    }

    double overdraftCharge( int daysOverdraw){
        if (isPremium()){
            double result = 10;
            if (daysOverdraw > 7)
                result += (daysOverdraw - 7) * 0.85;
            return result;
        }else
            return daysOverdraw * 1.75;
    }

}
