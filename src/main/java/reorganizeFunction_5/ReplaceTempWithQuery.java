package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  已查询取代临时变量
 */
public class ReplaceTempWithQuery {

    private int _itemPrice;
    private int _quantity;

    double getPrice(){
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000)
            discountFactor = 0.95;
        else
            discountFactor = 0.98;
        return basePrice * discountFactor;
    }


    double getPriceAfter(){
        return basePrice() * discountFactor();
    }

    private double discountFactor() {
        if (basePrice() > 1000)
            return  0.95;
        else
            return  0.98;
    }

    private int basePrice() {
        return _quantity * _itemPrice;
    }


}
