package objects.accounts;

import java.util.ArrayList;

public class CuentaAhorro extends Cuenta {

    private float withdrawLim;
    private String statementDay;
    private String statementPeriod;
    private String gracePeriod;
    private ArrayList<String> beneficiaries;

    public CuentaAhorro(float withdrawLim, String statementDay, String statementPeriod, String gracePeriod, ArrayList<String> beneficiaries, String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype) {
        super(number, creationDate, currency, balance, 0.04f, id, idtype);
        this.withdrawLim = withdrawLim;
        this.statementDay = statementDay;
        this.statementPeriod = statementPeriod;
        this.gracePeriod = gracePeriod;
        this.beneficiaries = beneficiaries;
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

    public float getWithdrawLim() {
        return withdrawLim;
    }

    public void setWithdrawLim(float withdrawLim) {
        this.withdrawLim = withdrawLim;
    }

    public String getStatementDay() {
        return statementDay;
    }

    public void setStatementDate(String statementDay) {
        this.statementDay = statementDay;
    }

    public String getStatementPeriod() {
        return statementPeriod;
    }

    public void setStatementPeriod(String statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public String getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public ArrayList<String> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(ArrayList<String> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public void modificarTasaInteresAnual(float tasaInteres) {
        super.setInterestRate(tasaInteres);
    }

    public double obtenerTasaInteresAnual() {
        return getInterestRate();
    }

    public String beneficiariesToSTring() {
        String str = "";

        for (Object i : getBeneficiaries()) {
            str = str + "\n" + i;
        }
        return str;
    }

    //DOC: Save format: number - year - month - day - currency - balance - interestRate - withdrawLim - statementDay - statementPeriod - gracePeriod - beneficiaries
    @Override
    public String toString() {
        return super.toString() + "\n" + getStatementDay() + "\n" + getStatementPeriod() + "\n" + getGracePeriod() + beneficiariesToSTring();
    }
}
