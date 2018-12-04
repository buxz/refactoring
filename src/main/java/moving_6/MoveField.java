package moving_6;

/**
 * Created by SQ_BXZ on 2018-12-04.
 * 搬移字段
 * 程序中，某个字段被其所驻之外的另一个类更多的用到
 */
public class MoveField {

    private double _interestRate; // 搬移至AccountType
    private AccountType _type;

    double interestForAmount_days(double amount, int days){
        return _interestRate * amount * days /365;
    }

    public double get_interestRate() {
        return _interestRate;
    }

    public void set_interestRate(double _interestRate) {
        this._interestRate = _interestRate;
    }

    double interestForAmount_days_after(double amount, int days){
        return _type.get_interestRate() * amount * days /365;
    }

    public double get_interestRate_after() {
        return _type.get_interestRate();
    }

    public void set_interestRate_after(double _interestRate) {
        _type.set_interestRate(_interestRate);
    }
}
