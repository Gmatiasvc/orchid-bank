package objects.operaciones;

public class Transferencia extends Operacion{
    private final String ACCR;
    private final String ACCS;

    public Transferencia(String ACCR, String ACCS, String PID, String UNIX, String MONTO, String IDENTIFIER, String SUCCESS) {
        super(PID, UNIX, MONTO, IDENTIFIER, SUCCESS);
        this.ACCR = ACCR;
        this.ACCS = ACCS;
    }

    public String getACCR() {
        return ACCR;
    }

    public String getACCS() {
        return ACCS;
    }

    @Override
    public String toString() {
        return getIDENTIFIER() + getSUCCESS() + getACCR() + getACCS() + getUNIX() + getMONTO() + getPID();
    }
}
