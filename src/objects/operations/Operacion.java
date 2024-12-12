package objects.operations;

public class Operacion {

	private final String PID;
	private final String UNIX;
	private final String MONTO;
	private final String IDENTIFIER;
	private final String SUCCESS;

	public Operacion(String PID, String UNIX, String MONTO, String IDENTIFIER, String SUCCESS) {
		this.PID = PID;
		this.UNIX = UNIX;
		this.MONTO = MONTO;
		this.IDENTIFIER = IDENTIFIER;
		this.SUCCESS = SUCCESS;
	}

	public String getPID() {
		return PID;
	}

	public String getUNIX() {
		return UNIX;
	}

	public String getMONTO() {
		return MONTO;
	}

	public String getIDENTIFIER() {
		return IDENTIFIER;
	}

	public String getSUCCESS() {
		return SUCCESS;
	}
}
