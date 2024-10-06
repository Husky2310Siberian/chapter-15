package gr.aueb.cf.ch15.BankApp;

import gr.aueb.cf.ch15.BankApp.Exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.BankApp.Exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.BankApp.Exceptions.SsnValidException;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if(!isSsnValid(ssn)){
                throw new SsnValidException(ssn);
            }
            setBalance(getBalance() - amount);
            //Logging
            System.out.println("success in withdraw amount " + amount + "Ssn " + ssn);
        } catch (SsnValidException | NegativeAmountException e) {
            System.err.println("Error " + e.getMessage() + LocalDateTime.now());
            throw  e;
        }
    }

    /**
     * useless method toString()
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
