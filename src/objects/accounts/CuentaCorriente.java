package objects.accounts;

public class CuentaCorriente extends Cuenta {

    private float overdraftLimit;
    private float chequeLimit;
    private float chequeNumberLimit;
    private String checkbookNumber;
    private float chequeCommission;

    public CuentaCorriente(float overdraftLimit, float chequeLimit, float chequeNumberLimit, String checkbookNumber, float chequeCommission, String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype) {
        super(number, creationDate, currency, balance, interestRate, id, idtype);
        this.overdraftLimit = overdraftLimit;
        this.chequeLimit = chequeLimit;
        this.chequeNumberLimit = chequeNumberLimit;
        this.checkbookNumber = checkbookNumber;
        this.chequeCommission = chequeCommission;
    }

    public void cuenta(String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype){
        setNumber(number);
        setCreationDate(creationDate);
        setCurrency(currency);
        setBalance(balance);
        setInterestRate(interestRate);
        setId(id);
        setIdtype(idtype);
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
    //DOC: Save format: number - year - month - day - currency - balance - interestRate - overdraftLim - chequeLim - ChequeNumberLim - CheckbookNum - ChequeCommis

    @Override
    public String toString() {
        return super.toString() + "\n" + getOverdraftLimit() + "\n" + getChequeLimit() + "\n" + getCheckbookNumber() + "\n" + getChequeCommission();
    }

}
