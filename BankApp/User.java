package gr.aueb.cf.ch15.BankApp;

/**
 * Class User , composition to Class Account
 */
public class User extends IdentifiableEntity{

    private String firstname;
    private String lastname;
    private String ssn;

    public User() {
    }

    public User(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    /**
     * copy constructor copies a state of an object , ''this'' is not necessary
     * @param user
     */
    public User (User user) {
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.ssn = user.getSsn();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
