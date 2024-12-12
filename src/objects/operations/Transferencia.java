package objects.operations;

import common.exceptions.BadStringToParse;

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

    public static Transferencia parseFromString(String str) throws BadStringToParse{
        if (str.length() != 46) {
            throw new BadStringToParse();
        }
        String pid = str.substring(36,46);
        String unix = str.substring(18,28);
        String monto = str.substring(28,36);
        String identifier = str.substring(0, 1);
        String success= str.substring(1, 2);
        String accr= str.substring(2, 10);
        String accs = str.substring(10,18);
        return new Transferencia(accr, accs, pid, unix, monto, identifier, success);
    }
}
