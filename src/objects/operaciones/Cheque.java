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

    public static Cheque parseFromString(String str){
        if (str.length() != 62) {
            return new Cheque(null, null, null, null, null, null, null, null, null);
        }
        String pid = str.substring(52,62);
        String unix = str.substring(34,44);
        String monto = str.substring(44,52);
        String identifier = str.substring(0, 1);
        String success= str.substring(1, 2);
        String accr= str.substring(2, 10);
        String accs = str.substring(10,18);
        String dni = str.substring(18,26);
        String cheque = str.substring(26,34);
        return new Cheque(accr, accs, dni, cheque, pid, unix, monto, identifier, success);
    }
}
