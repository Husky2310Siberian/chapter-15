package gr.aueb.cf.ch15.BankApp;

import gr.aueb.cf.ch15.BankApp.Exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.BankApp.Exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.BankApp.Exceptions.SsnValidException;

import java.time.LocalDateTime;

public class Account extends IdentifiableEntity {

    private String iban;
    private User holder;
    private double balance;

    public Account () {
        //super();
    }

    public Account(String iban, User holder, double balance) {
        //super();
        this.iban = iban;
        //this.holder = holder;
        this.holder = new User(holder);
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    //we use copy constructor, because we want to return a fresh copy
    public User getHolder() {
        return new User(holder);
    }

    //we use copy constructor, because we want to return a fresh copy
    public void setHolder(User holder) {
        this.holder = new User(holder);
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    /**
     * Deposits a certain amount of money into user' s {@link Account},
     * thus increasing the {@link Account #balance}
     * @param amount
     *          the amount of money
     * @throws NegativeAmountException
     *          if the amount is negative
     */
    public void deposit (double amount) throws NegativeAmountException {
        //boolean status = false;

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            //status = true;

            //Logging
            System.out.println("balance deposit " + holder + "amount " + amount + LocalDateTime.now());

        } catch (NegativeAmountException e){
            //Logging
            System.err.println("error in deposit negative amount, " + LocalDateTime.now());
            throw e;
        }
        //return status;
    }

    /**
     * Withdraws an amount of money, from an account {@link Account}
     * @param amount
     *          the amount of money to withdraw
     * @param ssn
     *          the ssn of {@link Account #holder}
     * @throws InsufficientBalanceException
     *          if the amount to withdraw is grater than the balance
     * @throws SsnValidException
     *          if the given ssn is not valid
     * @throws NegativeAmountException
     *          if the amount to withdraw is negative
     */
    public void withdraw (double amount , String ssn) throws InsufficientBalanceException ,
            SsnValidException , NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if(!isSsnValid(ssn)){
                throw new SsnValidException(ssn);
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(balance , amount);
            }
            balance -= amount;

            //Logging
            System.out.println("Balance withdraw success. " + "Ssn : " + ssn + " amount : " +amount + " , " + LocalDateTime.now());

        } catch (InsufficientBalanceException | SsnValidException | NegativeAmountException e){
            System.err.println("Service error " + e.getMessage() + " " + LocalDateTime.now());
            throw e;
        }
    }

    /**
     * Returns the {@link Account #balance}
     * @return the balance
     */
    public double getAccountBalance () {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid = " +getUuid() +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    protected boolean isSsnValid (String ssn) {
        if (ssn == null || this.getHolder().getSsn() == null) {
            return false;
        }
        return this.getHolder().getSsn().equals(ssn);
    }
}
