package moving_6;

/**
 * Created by SQ_BXZ on 2018-12-04.
 * 提炼类
 * 一个类应该是一个清楚的抽象，处理明确的责任
 * 场景： 某个类做了应该由两个类做的事情
 *
 */
public class ExtractClass {
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
