package moving_6.hide_delegate;

/**
 * Created by SQ_BXZ on 2018-12-04.
 *  隐藏委托关系
 *  场景 ： 客户用一个委托类调用另一个对象
 */
public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }

    public void setManager(Person manager) {
        this.manager = manager;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }
}
