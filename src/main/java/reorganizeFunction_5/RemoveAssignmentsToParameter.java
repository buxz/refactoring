package reorganizeFunction_5;

import java.util.Date;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  移除对参数赋值
 * 传递参数Java只采用按值传递
 */
public class RemoveAssignmentsToParameter {

    private double _height;
    private double _width;
    private double _primaryForce;
    private double _mass;
    private int _delay;
    private double _secondaryForce;

    int discount(int inputVal, int quantity, int yearToDate){
        if (inputVal > 50)
            inputVal -=2;
        if (quantity > 100)
            inputVal -=1;
        if (yearToDate > 1000)
            inputVal -=4;
        return inputVal;
    }

    int discount_after(int inputVal, int quantity, int yearToDate){
        int result = inputVal;
        if (inputVal > 50)
            result -=2;
        if (quantity > 100)
            result -=1;
        if (yearToDate > 1000)
            result -=4;
        return result;
    }

    static void triple(int arg){
        arg = arg * 3;
        System.out.println(" arg in triple: "+arg);
    }

    static void  nextDateUpdate(Date arg){
        arg.setDate(arg.getDate() +1);
        System.out.println(" arg in nextDay: " +arg);
    }
    static void nextDateReplace(Date arg){
       arg = new Date(arg.getYear(),arg.getMonth(),arg.getDate()+1);
        System.out.println("arg in nextDay:"+arg);
    }



    public static void main(String[] args) {
        int x = 5;
        triple(x);
        System.out.println(" x after triple: " + x);

        // d1的值会改变，d2的值不会改变
        // 本质上说对象的引用是按值传递的，因此可以修改对象的内部状态，
        // 但对参数对象重新赋值是没有意义的
        // 证明 Java参数传递是按照值传递
        Date d1 = new Date("1 Apr 98");
        nextDateUpdate(d1); // 该边对象的内部状态
        System.out.println("d1 after nextDay:" +d1);
        Date d2 = new Date("1 Apr 98");
        nextDateReplace(d2); // 改变对象的引用
        System.out.println("d2 after nextDay:" +d2);
    }









}
