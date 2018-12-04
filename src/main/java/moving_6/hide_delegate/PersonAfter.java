package moving_6.hide_delegate;

/**
 * Created by SQ_BXZ on 2018-12-04.
 *  隐藏委托关系
 *  场景 ： 客户用一个委托类调用另一个对象
 */
public class PersonAfter {
    Department department;

    // 用户隐藏 perosn 和 department 的之间的关系
    // 前： manager = john.getDepartment().getManager()
    // 后： manager = john.getManager()
    public Person getManager() {
        return department.getManager();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
