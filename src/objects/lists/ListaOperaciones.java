package objects.lists;

import database.DataRead;
import java.util.ArrayList;
import java.util.LinkedList;
import objects.operaciones.Cheque;
import objects.operaciones.Deposito;
import objects.operaciones.Operacion;
import objects.operaciones.Retiro;
import objects.operaciones.Transferencia;

public class ListaOperaciones {
    @SuppressWarnings("FieldMayBeFinal")
    private LinkedList<Operacion> list = new LinkedList<>();
    private ArrayList<String> strList;

    private String accountNumber;

    public ListaOperaciones(String accountNumber) {
        this.accountNumber = accountNumber;
        setList();
    }

    public LinkedList<Operacion> getList() {
        return list;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setList(){
        strList = DataRead.readOperation(getAccountNumber(), false);
        if (strList.getLast() == null){
            list.add(null);
        }
        else{
            for (String i : strList) {
                switch (i.substring(0,1)) {
                case "0" -> {list.add(Deposito.parseFromString(i));}
                case "1" -> {list.add(Retiro.parseFromString(i));}
                case "2","3" -> {list.add(Transferencia.parseFromString(i));}
                case "4","5" -> {list.add(Cheque.parseFromString(i));}
                default -> {list.add(null);}
                }
            }
        }
    }

    public void setList(LinkedList<Operacion> list) {
        this.list = list;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        setList();
    }    
}
