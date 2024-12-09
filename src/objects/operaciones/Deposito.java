package objects.operaciones;

public class Deposito extends Operacion{
    private final String ACC;
    private final String DNI;
    
    public Deposito(String PID, String UNIX, String MONTO, String IDENTIFIER, String SUCCESS, String ACC, String DNI) {
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

}
