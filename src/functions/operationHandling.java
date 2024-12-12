package functions;

import database.DataSave;
import java.time.Instant;
import objects.operaciones.Cheque;
import objects.operaciones.Deposito;
import objects.operaciones.Retiro;
import objects.operaciones.Transferencia;

public class operationHandling {
    
    public static Deposito registerDeposito(String MONTO, String PID, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Deposito obj = new Deposito(PID, UNIX, MONTO, "0", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Retiro registerRetiro(String MONTO, String PID, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Retiro obj = new Retiro(PID, UNIX, MONTO, "1", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaEntrante(String ACCR, String ACCS, String PID, String MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, PID, UNIX, MONTO, "2", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaSaliente(String ACCR, String ACCS, String PID, String MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, PID, UNIX, MONTO, "3", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }

    public static Cheque registerChequeEntrante(String ACCR, String ACCS, String DNI, String CHEQUE, String PID, String MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, PID, UNIX, MONTO, "4", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Cheque registerChequeSaliente(String ACCR, String ACCS, String DNI, String CHEQUE, String PID, String MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, PID, UNIX, MONTO, "5", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }
}