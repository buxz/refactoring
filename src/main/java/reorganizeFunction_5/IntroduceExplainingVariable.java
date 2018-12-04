package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  引入解释性变量
 */
public class IntroduceExplainingVariable {

    private int _itemPrice;
    private int _quantity;

    double getPrice(){
        return  _quantity * _itemPrice
                - Math.max(0,_quantity - 500) * _itemPrice * 0.05
                + Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }

    double getPriceAfter(){
        final double basePrice = _quantity * _itemPrice;
        final double quantityDiscount = Math.max(0,_quantity - 500) * _itemPrice * 0.05;
        final double shipping = Math.min(basePrice * 0.1, 100.0);
        return  basePrice - quantityDiscount + shipping;
    }
    double getPriceAfter_02(){
        return  basePrice() - quantityDiscount() + shipping();
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }

    private double basePrice(){
        return _quantity * _itemPrice;
    }
    private double quantityDiscount(){
        return  Math.max(0,_quantity - 500) * _itemPrice * 0.05;
    }




}
