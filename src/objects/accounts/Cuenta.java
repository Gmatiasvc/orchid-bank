package objects.accounts;

public class Cuenta {

    private String number;
    private String[] creationDate;
    private String currency;
    private double balance;
    private float interestRate;
    private String id;
    private String idtype;

    public Cuenta(String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype) {
        this.number = number;
        this.creationDate = creationDate;
        this.currency = currency;
        this.balance = balance;
        this.interestRate = interestRate;
        this.id = id;
        this.idtype = idtype;
    }

    public String getNumeroCuenta() {
        return number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String[] getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String[] creationDate) {
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

    @Override
    public String toString() {
        return getNumber() + "\n" + getId() + "\n" + getIdtype() + "\n" + getCreationDate()[0] + "\n" + getCreationDate()[1] + "\n" + getCreationDate()[2] + "\n" + getCurrency() + "\n" + getBalance() + "\n" + getInterestRate();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
}
