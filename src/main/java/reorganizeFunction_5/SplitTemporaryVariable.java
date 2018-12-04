package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  分解临时变量
 *  每个变量只承担一个责任
 */
public class SplitTemporaryVariable {

    private double _height;
    private double _width;
    private double _primaryForce;
    private double _mass;
    private int _delay;
    private double _secondaryForce;

    void init(){
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        temp = _height * _width;
        System.out.println(temp);
    }
    void init_after(){
        final double perimeter = 2 * (_height + _width);
        System.out.println(perimeter);
        final double area =_height * _width;
        System.out.println(area);
    }

    double getDistanceTravelled(int time){
        double result;
        double acc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * acc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0){
            double primaryVel = acc * _delay;
            acc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5*acc*secondaryTime*secondaryTime;
        }
        return result;
    }

    double getDistanceTravelled_after(int time){
        double result;
        final double primaryAcc = _primaryForce / _mass;
        int primaryTime = Math.min(time, _delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - _delay;
        if (secondaryTime > 0){
            double primaryVel = primaryAcc * _delay;
            final  double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
            result += primaryVel * secondaryTime + 0.5*secondaryAcc*secondaryTime*secondaryTime;
        }
        return result;
    }

    double getDistanceTravelled_after_2(int time){
        double result = 0.5 * primaryAcc() * primaryTime(time) * primaryTime(time);
        if (secondaryTime(time) > 0){
            result += primaryVel() * secondaryTime(time) + 0.5*secondaryAcc()*secondaryTime(time)*secondaryTime(time);
        }
        return result;
    }

    double primaryAcc(){
         return  _primaryForce / _mass;
    }
    int primaryTime(int time){
         return  Math.min(time, _delay);
    }
    int secondaryTime(int time){
        return  time - _delay;
    }
    double primaryVel(){
        return  primaryAcc() * _delay;
    }
    double secondaryAcc(){
        return  (_primaryForce + _secondaryForce) / _mass;
    }









}
