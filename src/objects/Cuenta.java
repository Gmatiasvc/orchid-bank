package objects;

import java.util.GregorianCalendar;

public class Cuenta{
    private String number;
    private GregorianCalendar creationDate;
    private String currency;
    private double balance;
    private float interestRate;

    public Cuenta(String number, GregorianCalendar creationDate, String currency, double balance, float interestRate) {
        this.number = number;
        this.creationDate = creationDate;
        this.currency = currency;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public GregorianCalendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(GregorianCalendar creationDate) {
        this.creationDate = creationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }    
}