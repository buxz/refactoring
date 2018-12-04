package moving_6.extract_class;

/**
 *  Created by SQ_BXZ on 2018-12-04.
 *  提炼类
 *  场景 ： 某个类做个两个类该做的事情
 *  与之相反的是 内连类
 *
 */
public class Person {

    private String _name;
    private String _officeAreaCode;
    private String _officeNumber;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }

    public String get_officeAreaCode() {
        return _officeAreaCode;
    }

    public void set_officeAreaCode(String _officeAreaCode) {
        this._officeAreaCode = _officeAreaCode;
    }

    public String get_officeNumber() {
        return _officeNumber;
    }

    public void set_officeNumber(String _officeNumber) {
        this._officeNumber = _officeNumber;
    }
}
