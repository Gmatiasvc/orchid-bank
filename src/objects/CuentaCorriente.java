package objects;

import java.util.GregorianCalendar;

public class CuentaCorriente extends Cuenta{
    private float overdraftLimit;
    private float chequeLimit;
    private float chequeNumberLimit;
    private String checkbookNumber;
    private float chequeCommission;

    public CuentaCorriente(float overdraftLimit, float chequeLimit, float chequeNumberLimit, String checkbookNumber, float chequeCommission, String number, GregorianCalendar creationDate, String currency, double balance, float interestRate) {
        super(number, creationDate, currency, balance, interestRate);
        this.overdraftLimit = overdraftLimit;
        this.chequeLimit = chequeLimit;
        this.chequeNumberLimit = chequeNumberLimit;
        this.checkbookNumber = checkbookNumber;
        this.chequeCommission = chequeCommission;
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public float getChequeLimit() {
        return chequeLimit;
    }

    public void setChequeLimit(float chequeLimit) {
        this.chequeLimit = chequeLimit;
    }

    public float getChequeNumberLimit() {
        return chequeNumberLimit;
    }

    public void setChequeNumberLimit(float chequeNumberLimit) {
        this.chequeNumberLimit = chequeNumberLimit;
    }

    public String getCheckbookNumber() {
        return checkbookNumber;
    }

    public void setCheckbookNumber(String checkbookNumber) {
        this.checkbookNumber = checkbookNumber;
    }

    public float getChequeCommission() {
        return chequeCommission;
    }

    public void setChequeCommission(float chequeCommission) {
        this.chequeCommission = chequeCommission;
    }

    
}
