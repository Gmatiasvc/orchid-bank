package components;

import objects.accounts.Persona;
import objects.accounts.PersonaJuridica;
import objects.lists.ListaClientesJuridicos;
import objects.lists.ListaClientesNaturales;

@SuppressWarnings("FieldMayBeFinal")
public class Login {
	private ListaClientesNaturales listaPersonas = new ListaClientesNaturales();
	private ListaClientesJuridicos listaJuridicos = new ListaClientesJuridicos();
	public Login(){

	}

	public boolean loginUser(String usr, String psw){
		for (Persona i : listaPersonas.getList()) {
			if (i.getIdString().equals(usr)){
				if(i.getPhoneNumber().equals(psw)){
					return true;
				}
			}
		}

		for (PersonaJuridica i : listaJuridicos.getList()){
			if (i.getRuc().equals(usr)){
				if (i.getPhoneNumber().equals(psw)){
					return true;
				}
			}
		}
		return false;
	}

	public boolean loginEmployee(String usr, String psw){
		return usr.equals(psw);
	}

	public boolean loginAdmin(String usr, String psw){

		if (usr.equals("admin") && usr.equals("admin")){
			return true;
		}
		if (usr.equals("root") && usr.equals("root")){
			return true;
		}
            return usr.equals("sudo") && usr.equals("sudo");
	}
}
