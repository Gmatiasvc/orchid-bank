package functions;

import java.time.Instant;
import objects.operaciones.Deposito;

public class operationHandling {
    
    public static Deposito registerDeposito(String MONTO, String PID, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Deposito obj = new Deposito(PID, UNIX, MONTO, "1", SUCCESS, ACC, DNI);
        return obj;
    }
}