package objects;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CuentaAhorro extends Cuenta
        implements ImptoTransaccionesFinancieras, interesMensual {

    private static double tasaInteresAnual = 0.04f;
    private float withdrawLim;
    private GregorianCalendar statementDate;
    private int statementPeriod;
    private int gracePeriod;
    private Persona[] beneficiaries;
    ArrayList<Movimientos> operaciones;

    public CuentaAhorro(float withdrawLim, GregorianCalendar statementDate, int statementPeriod, int gracePeriod, Persona[] beneficiaries, String number, GregorianCalendar creationDate, String currency, double balance, float interestRate, int tipoCuenta) {
        super(number, creationDate, currency, balance, interestRate, tipoCuenta);
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

    public static void modificarTasaInteresAnual(float tasaInteresA) {
        tasaInteresAnual = tasaInteresA;
    }

    public static double obtenerTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public boolean realizarDeposito(float montoD) {
        Movimientos movimiento;
        setBalance(getBalance() + montoD);
        movimiento = new Movimientos(1, montoD);
        operaciones.add(movimiento);
        if (montoD >= 1000) {
            setBalance(getBalance() - calcularITF(montoD));
            movimiento = new Movimientos(4, calcularITF(montoD));
            operaciones.add(movimiento);
        }
        return true;
    }

    public boolean realizarRetiro(float montoR) {
        Movimientos movimiento;
        float montoITF = calcularITF(montoR);
        if (montoR >= 1000) {
            if (montoR + montoITF <= getBalance()) {
                setBalance(montoITF);
                movimiento = new Movimientos(2, montoR);
                operaciones.add(movimiento);
                setBalance(getBalance() + montoR);
                movimiento = new Movimientos(4, montoITF);
                operaciones.add(movimiento);
                return true;
            }
            return false;
        } else {
            if (montoR <= getBalance()) {
                setBalance(getBalance() - montoR);
                movimiento = new Movimientos(2, montoR);
                operaciones.add(movimiento);
                return true;
            }
        }
        return false;
    }

    @Override
    public void calcularInteresMensual() {
        Movimientos movimiento;
        double interesMensual = getBalance() * obtenerTasaInteresAnual() / 12;
        setBalance(getBalance() + interesMensual);
        movimiento = new Movimientos(5, interesMensual);
        operaciones.add(movimiento);
    }

    @Override
    public float calcularITF(float cantidad) {
        return cantidad * ITF;
    }

    public ArrayList<Movimientos> getOperaciones() {
        return operaciones;
    }

}
