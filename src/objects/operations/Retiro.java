package objects.operations;

import common.exceptions.BadStringToParse;

public class Retiro extends Operacion{
    private final String ACC;
    private final String DNI;

    public Retiro(String PID, String UNIX, String MONTO, String IDENTIFIER, String SUCCESS, String ACC, String DNI) {
        super(PID, UNIX, MONTO, IDENTIFIER, SUCCESS);
        this.ACC = ACC;
        this.DNI = DNI;
    }
    
    public String getACC() {
        return ACC;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return getIDENTIFIER() + getSUCCESS() + getACC() + getDNI() + getUNIX() + getMONTO() + getPID();
    }

    public static Retiro parseFromString(String str) throws BadStringToParse{
        if (str.length() != 46) {
            throw new BadStringToParse();
        }
        String pid = str.substring(36,46);
        String unix = str.substring(18,28);
        String monto = str.substring(28,36);
        String identifier = str.substring(0, 1);
        String success= str.substring(1, 2);
        String aac= str.substring(2, 10);
        String dni = str.substring(10,18);
        return new Retiro(pid, unix, monto, identifier, success, aac, dni);
        
    }
}