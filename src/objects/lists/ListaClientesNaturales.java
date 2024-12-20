package objects.lists;

import database.DataRead;
import database.InfoRead;
import java.util.LinkedList;
import objects.accounts.Persona;

public class ListaClientesNaturales {

    @SuppressWarnings("FieldMayBeFinal")
    private LinkedList<Persona> list = new LinkedList<>();

    public ListaClientesNaturales() {
        int dbsize = InfoRead.clientNatural();
        Persona pnat;
        for (int i = 0; i <= dbsize; i++) {
            pnat = DataRead.readPersona(i, false);
            if (pnat.getName() != null || !"null".equals(pnat.getName()) || !"".equals(pnat.getName())) {
                list.add(pnat);
            }
        }
    }

    public LinkedList<Persona> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }

    public boolean addAccount(Persona pnat) {
        if (pnat.getName() != null || !"null".equals(pnat.getName()) || !"".equals(pnat.getName())) {
            list.add(pnat);
            return true;
        }
        return false;
    }

    public Persona getFromIndex(int index) {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            String[] empty3 = {null, null, null};
            String[] empty4 = {null, null, null, null};
            return new Persona(null, null, null, null, empty3, empty4, null, null, null);
        }
    }

    public boolean removeFromIndex(int index) {
        try {
            list.remove(index);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;

        }
    }

    public int getIndexFromObject(Persona pnat) {
        return list.indexOf(pnat);
    }

    public int getIndexFromName(String str) {
        for (int i = 0; i < getSize(); i++) {
            if ((getFromIndex(i).getName() + " " + getFromIndex(i).getSurname()).equals(str) || (getFromIndex(i).getSurname() + " " + getFromIndex(i).getName()).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexFromId(String str1, String str2) {
        for (int i = 0; i < getSize(); i++) {
            if (getFromIndex(i).getIdString().equals(str1) && getFromIndex(i).getIdType().equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexFromContactInfo(String str1, String str2) {
        for (int i = 0; i < getSize(); i++) {
            if (getFromIndex(i).getPhoneNumber().equals(str1) && getFromIndex(i).getEmail().equals(str2)) {
                return i;
            }
        }
        return -1;
    }
}
