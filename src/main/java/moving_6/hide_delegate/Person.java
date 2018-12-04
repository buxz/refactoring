package moving_6.hide_delegate;

/**
 * Created by SQ_BXZ on 2018-12-04.
 *  隐藏委托关系
 *  场景 ： 客户用一个委托类调用另一个对象
 */
public class Person {

    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
