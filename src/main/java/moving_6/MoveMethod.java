package moving_6;

/**
 * Created by SQ_BXZ on 2018-12-04.
 * 搬移函数
 * 场景： 一个类有很多行为或者一个类与别的类高度耦合
 */
public class MoveMethod {
    private int _daysOverdraw;
    private AccountType _type;

    double overdraftCharge(){
        if (_type.isPremium()){
            double result = 10;
            if (_daysOverdraw > 7)
                result += (_daysOverdraw - 7) * 0.85;
            return result;
        }else
            return _daysOverdraw * 1.75;
    }

    double bankCharge(){
        double result = 4.5;
        if (_daysOverdraw > 0)
            result += overdraftCharge();
        return result;
    }

    double overdraftCharge_after(){
        return _type.overdraftCharge(_daysOverdraw);
    }
}
