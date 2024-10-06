package gr.aueb.cf.ch15.BankApp.Exceptions;

public class SsnValidException extends Exception{

    private static final long serialVersionUID = -123456789L;

    public SsnValidException(String ssn) {
        super("Ssn " + ssn + "not valid");
    }

}
