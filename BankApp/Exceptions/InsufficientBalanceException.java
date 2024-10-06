package gr.aueb.cf.ch15.BankApp.Exceptions;

public class InsufficientBalanceException extends Exception{

    private static final long serialVersionUID = 1L;

    /**
     * user-defined exception
     * @param balance
     * @param amount
     */
    public InsufficientBalanceException(double balance , double amount ) {
        super("insufficient balance " + balance + "for amount " + amount);

    }
}
