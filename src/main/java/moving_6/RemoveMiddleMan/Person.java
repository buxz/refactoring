package moving_6.RemoveMiddleMan;

import moving_6.hide_delegate.Department;

/**
 * Created by SQ_BXZ on 2018-12-04.
 *  移除中间人
 *  场景 ：某个类做了过多的简单委托动作
 *  目的： 让客户直接调用受托类
 */
public class Person {
    Department department;

    // 用户隐藏 perosn 和 department 的之间的关系
    // 前： manager = john.getDepartment().getManager()
    // 后： manager = john.getManager()
    public moving_6.hide_delegate.Person getManager() {
        return department.getManager();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
