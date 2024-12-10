package objects.lists;

import database.DataRead;
import java.util.LinkedList;
import objects.Persona;
import objects.PersonaJuridica;

public class ListaClientesJuridicos {
    @SuppressWarnings("FieldMayBeFinal")
    private LinkedList<PersonaJuridica> list = new LinkedList<>();

    public ListaClientesJuridicos() {
        int dbsize = 0;
        PersonaJuridica pjurd;
        for (int i = 0; i <= dbsize; i++) {
            pjurd = DataRead.readPersonaJuridica(i, false);
            if (pjurd.getCompanyName() != null || !"null".equals(pjurd.getCompanyName())|| !"".equals(pjurd.getCompanyName())) {
                list.add(pjurd);
            }
        }
    }
    
    public LinkedList<PersonaJuridica> getList() {
        return list;
    }

    public int getSize(){
        return list.size();
    }

    public boolean addAccount(PersonaJuridica pjurd) {
        if (pjurd.getCompanyName() != null || !"null".equals(pjurd.getCompanyName())|| !"".equals(pjurd.getCompanyName())) {
            list.add(pjurd);
            return true;
        }
        return false;
    }

    public PersonaJuridica getFromIndex(int index){
        try {
            return list.get(index);
        }
        catch(IndexOutOfBoundsException e)
        {
        String[] empty3 = {null, null,null};
        String[] empty4 = {null, null,null,null};
        return new PersonaJuridica(null, null,  empty3, null, null, new Persona(null, null, null, null,  empty3,  empty4, null, null, null), null);
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

    public int getIndexFromObject(PersonaJuridica pjurd){
        return list.indexOf(pjurd);
    }

    public int getIndexFromName(String str){
        for (int i = 0; i < getSize(); i++) {
            if(getFromIndex(i).getCompanyName().equals(str)){
                return i;
            }
        }
        return -1;
    }

    public int getIndexFromRuc(String str){
        for (int i = 0; i < getSize(); i++) {
            if(getFromIndex(i).getRuc().equals(str)){
                return i;
            }
        }
        return -1;
    }

    public int getIndexFromIncorporationDoc(String str){
        for (int i = 0; i < getSize(); i++) {
            if(getFromIndex(i).getIncorporationDoc().equals(str)){
                return i;
            }
        }
        return -1;
    }
}
