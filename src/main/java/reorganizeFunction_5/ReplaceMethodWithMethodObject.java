package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  以函数对象取代函数
 *  场景： 大型函数，且无法使用extractMethod
 */
public class ReplaceMethodWithMethodObject extends Account {

    int gamma(int inputVal, int quantity, int yearToDate){
        int importantValue1 = (inputVal*quantity) + delta();
        int importantValue2 = (inputVal*quantity) + 100;
        if (yearToDate-importantValue1 > 100)
            importantValue2 -=20;
        int importantValue3 = importantValue2 * 7;
        return importantValue3 - 2*importantValue1;
    }

    int gamma_after(int inputVal, int quantity, int yearToDate){
        return new Gamma(this,inputVal,quantity,yearToDate).compute();
    }
}
