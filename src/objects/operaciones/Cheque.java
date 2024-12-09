package objects.operaciones;

public class Cheque extends Operacion {
    private final String ACCR;
    private final String ACCS;
    private final String DNI;
    private final String CHEQUE;

    public Cheque(String ACCR, String ACCS, String DNI, String CHEQUE, String PID, String UNIX, String MONTO, String IDENTIFIER, String SUCCESS) {
        super(PID, UNIX, MONTO, IDENTIFIER, SUCCESS);
        this.ACCR = ACCR;
        this.ACCS = ACCS;
        this.DNI = DNI;
        this.CHEQUE = CHEQUE;
    }

    public String getACCR() {
        return ACCR;
    }

    public String getACCS() {
        return ACCS;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCHEQUE() {
        return CHEQUE;
    }

    @Override
    public String toString() {
        return getIDENTIFIER() + getSUCCESS() + getACCR() + getACCS() + getDNI() + getCHEQUE() + getUNIX() + getMONTO() + getPID();
    }
}
