package objects;

import java.util.*;

public class CreacionCuentas {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();
     
    public boolean agregarCuenta(Cuenta cuenta) {
        if(cuenta != null) {
            listaCuentas.add(cuenta);
            return true;
        }
        return false;
    }
    
    public int getTamanio() {
        return listaCuentas.size();
    }
    
    public void listarCuentas() {
        for(int i=0; i<getTamanio(); i++) 
            System.out.println(listaCuentas.get(i).toString());
    }
    
    public void listarCuentasPorTipo(int tipo) {
        Cuenta cuenta;
        for(int i=0; i<getTamanio(); i++) {
            cuenta = listaCuentas.get(i);
            if(cuenta.getTipoCuenta()==tipo) 
                System.out.println(cuenta.toString());
        }
    }               
}