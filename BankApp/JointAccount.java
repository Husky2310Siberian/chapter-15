package gr.aueb.cf.ch15.BankApp;

import java.util.Arrays;

public class JointAccount extends Account {

    private User [] otherHolders;

    public JointAccount(){
        super();
    }

    public JointAccount(String iban, User holder, double balance, User[] otherHolders) {
        super(iban, holder, balance);
        //this.otherHolders = otherHolders;
        this.otherHolders = new User[otherHolders.length];
        //new copy otherHolders[]
        for(int i = 0; i < otherHolders.length; i++) {
            this.otherHolders[i] = new User(otherHolders[i]);
        }
    }

    public User[] getOtherHolders() {
        //return otherHolders;
        User [] otherHolders = new User[this.otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            otherHolders[i] = new User (this.otherHolders[i]);
        }
        return otherHolders;
    }

    public void setOtherHolders(User[] otherHolders) {
        //this.otherHolders = otherHolders;
        // θα αντέγραφε απευθείας την αναφορά του πίνακα otherHolders στο πεδίο otherHolders της κλάσης.
        // Όμως, αυτό θα έκανε την αναφορά απευθείας στο αρχικό αντικείμενο (shallow copy),
        // με αποτέλεσμα αν άλλαζε το περιεχόμενο του αρχικού πίνακα, να επηρεάζει και τον πίνακα της κλάσης.
        this.otherHolders = new User[otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++){
            this.otherHolders[i] = new User(otherHolders[i]);
        }
    }

    @Override

    protected boolean isSsnValid(String ssn) {
       boolean areOthersValid = false;

       for (User user : otherHolders) {
           if (user.getSsn().equals(ssn)) {
               areOthersValid = true;
               break;
           }
       }
        return super.isSsnValid(ssn) || areOthersValid;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "uuid " + getUuid() +
                "otherHolders=" + Arrays.toString(otherHolders) +
                "balance = " + getBalance() +
                "IBAN : " +getIban() +
                '}';
    }
}
