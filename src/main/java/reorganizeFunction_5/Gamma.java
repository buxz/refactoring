package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-04.
 */
public class Gamma {

    private final Account _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;

    public Gamma(Account _account, int inputVal, int quantity, int yearToDate) {
        this._account = _account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute(){
        importantValue1 = (inputVal*quantity) + _account.delta();
        importantValue2 = (inputVal*quantity) + 100;
        if (yearToDate-importantValue1 > 100)
            importantValue2 -=20;
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2*importantValue1;
    }
}
