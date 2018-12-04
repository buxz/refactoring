package moving_6.extract_class;

/**
 * Created by SQ_BXZ on 2018-12-04.
 */
public class PersonAfter {

    private String _name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    public TelephoneNumber getOfficePhone() {
        return officeTelephone;
    }
}
