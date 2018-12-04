package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  内联函数
 */
public class InlineMethod {

    private String _name;
    private int _numberOfLateDeliveries;

    int getRating(){
        return (moreThanFiveLateDeliveries())? 2 :1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries >5;
    }

    int getRating_after(){
        return (_numberOfLateDeliveries >5)? 2 :1;
    }


}
