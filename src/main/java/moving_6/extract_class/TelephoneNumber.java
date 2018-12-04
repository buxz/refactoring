package moving_6.extract_class;

/**
 * Created by SQ_BXZ on 2018-12-04.
 */
public class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getTelephoneNumber() {
        return ("(" + getAreaCode() + ")" + getNumber());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
