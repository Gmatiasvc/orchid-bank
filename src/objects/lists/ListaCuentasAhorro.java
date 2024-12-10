package objects.lists;

import database.DataRead;
import database.InfoRead;
import java.util.ArrayList;
import java.util.LinkedList;
import objects.CuentaAhorro;

public class ListaCuentasAhorro {
    @SuppressWarnings("FieldMayBeFinal")
    private LinkedList<CuentaAhorro> list = new LinkedList<>();

    public ListaCuentasAhorro() {
        int dbsize = InfoRead.accountAhorro();
        CuentaAhorro caho;
        for (int i = 0; i <= dbsize; i++) {
            caho = DataRead.readCuentaAhorro(i, false);
            if (caho.getNumber() != null || !"null".equals(caho.getNumber())|| !"".equals(caho.getNumber())) {
                list.add(caho);
            }
        }
    }
    
    public LinkedList<CuentaAhorro> getList() {
        return list;
    }

    public int getSize(){
        return list.size();
    }

    public boolean addAccount(CuentaAhorro caho) {
        if (caho.getNumber() != null || !"null".equals(caho.getNumber())|| !"".equals(caho.getNumber())) {
            list.add(caho);
            return true;
        }
        return false;
    }

    public CuentaAhorro getFromIndex(int index){
        try {
            return list.get(index);
        }
        catch(IndexOutOfBoundsException e)
        {
        String[] empty3 = {null, null,null};
        ArrayList<String> emptyArray = new ArrayList<>();
        return new CuentaAhorro(0.0f, null, null, null, emptyArray, null, empty3, null, 0.0, 0.0f, null, null);

        }
    }

    public boolean removeFromIndex(int index){
        try {
            list.remove(index);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;

        }
    }

    public int getIndexFromObject(CuentaAhorro caho){
        return list.indexOf(caho);
    }

    public int getIndexFromNumber(String str){
        for (int i = 0; i < getSize(); i++) {
            if((getFromIndex(i).getNumber().equals(str))){
                return i;
            }
        }
        return -1;
    }
}
