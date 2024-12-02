package objects;

import java.util.GregorianCalendar;

public class CuentaAhorro extends Cuenta{
    private float withdrawLim;
    private GregorianCalendar statementDate;
    private int statementPeriod;
    private int gracePeriod;
    private Persona[] beneficiaries;

    public CuentaAhorro(float withdrawLim, GregorianCalendar statementDate, int statementPeriod, int gracePeriod, Persona[] beneficiaries, String number, GregorianCalendar creationDate, String currency, double balance, float interestRate) {
        super(number, creationDate, currency, balance, interestRate);
        this.withdrawLim = withdrawLim;
        this.statementDate = statementDate;
        this.statementPeriod = statementPeriod;
        this.gracePeriod = gracePeriod;
        this.beneficiaries = beneficiaries;
    }

    public float getWithdrawLim() {
        return withdrawLim;
    }

    public void setWithdrawLim(float withdrawLim) {
        this.withdrawLim = withdrawLim;
    }

    public GregorianCalendar getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(GregorianCalendar statementDate) {
        this.statementDate = statementDate;
    }

    public int getStatementPeriod() {
        return statementPeriod;
    }

    public void setStatementPeriod(int statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Persona[] getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(Persona[] beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    
}
