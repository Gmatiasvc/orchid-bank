package functions;

import database.DataSave;
import objects.operations.Cheque;
import objects.operations.Deposito;
import objects.operations.Retiro;
import objects.operations.Transferencia;

import java.time.Instant;

public class operationHandling {
    
    public static Deposito registerDeposito(int MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Deposito obj = new Deposito(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO) , "0", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Retiro registerRetiro(int MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Retiro obj = new Retiro(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "1", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaEntrante(String ACCR, String ACCS, int MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "2", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaSaliente(String ACCR, String ACCS,  int MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "3", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }

    public static Cheque registerChequeEntrante(String ACCR, String ACCS, String DNI, String CHEQUE, int MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "4", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Cheque registerChequeSaliente(String ACCR, String ACCS, String DNI, String CHEQUE, int MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "5", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }   



    public static Deposito registerDeposito(float MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Deposito obj = new Deposito(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO) , "0", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Retiro registerRetiro(float MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Retiro obj = new Retiro(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "1", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaEntrante(String ACCR, String ACCS, float MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "2", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaSaliente(String ACCR, String ACCS,  float MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "3", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }

    public static Cheque registerChequeEntrante(String ACCR, String ACCS, String DNI, String CHEQUE, float MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "4", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Cheque registerChequeSaliente(String ACCR, String ACCS, String DNI, String CHEQUE, float MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "5", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }


    
    public static Deposito registerDeposito(double MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Deposito obj = new Deposito(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO) , "0", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Retiro registerRetiro(double MONTO, String SUCCESS, String ACC, String DNI){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Retiro obj = new Retiro(stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "1", SUCCESS, ACC, DNI);
        DataSave.appendOperationAccount(obj.getACC(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaEntrante(String ACCR, String ACCS, double MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "2", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Transferencia registerTransferenciaSaliente(String ACCR, String ACCS,  double MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Transferencia obj = new Transferencia(ACCR, ACCS, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "3", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }

    public static Cheque registerChequeEntrante(String ACCR, String ACCS, String DNI, String CHEQUE, double MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "4", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCR(), false, obj);
        return obj;
    }

    public static Cheque registerChequeSaliente(String ACCR, String ACCS, String DNI, String CHEQUE, double MONTO, String SUCCESS){
        String UNIX = Long.toString(Instant.now().getEpochSecond());
        Cheque obj = new Cheque(ACCR, ACCS, DNI, CHEQUE, stringFormatter.pidGenerator(), UNIX, stringFormatter.montoFormatter(MONTO), "5", SUCCESS);
        DataSave.appendOperationAccount(obj.getACCS(), false, obj);
        return obj;
    }
}