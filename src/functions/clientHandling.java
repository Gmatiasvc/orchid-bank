package functions;

import database.DataSave;
import database.InfoRead;
import database.InfoSave;
import objects.accounts.Persona;
import objects.accounts.PersonaJuridica;

public class clientHandling {

	public static Persona createNatural(String name, String surname, String idString, String idType, String[] dayOfBirth, String[] adress, String phoneNumber, String email, String civilStatus) {
		try {
			int sizeofSave = InfoRead.clientNatural();
			Persona object = new Persona(name, surname, idString, idType, dayOfBirth, adress, phoneNumber, email, civilStatus);
			DataSave.saveClientNatural(sizeofSave + 1, object, false);
			InfoSave.clientNatural(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static Persona createNatural(String name, String surname, String idString, String idType, String year, String month, String day, String state, String region, String district, String street, String phoneNumber, String email, String civilStatus) {
		try {
			String[] dayOfBirth = {year, month, day};
			String[] adress = {state, region, district, street};
			int sizeofSave = InfoRead.clientNatural();
			Persona object = new Persona(name, surname, idString, idType, dayOfBirth, adress, phoneNumber, email, civilStatus);
			DataSave.saveClientNatural(sizeofSave + 1, object, false);
			InfoSave.clientNatural(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static PersonaJuridica createPersonaJuridica(String companyName, String ruc, String state, String region, String district, String street, String phoneNumber, String email, Persona representative, String incorporationDoc) {
		try {
			int sizeofSave = InfoRead.clientJuridica();
			String[] adress = {state, region, district, street};
			PersonaJuridica object = new PersonaJuridica(companyName, ruc, adress, phoneNumber, email, representative, incorporationDoc);
			DataSave.saveClientJuridica(sizeofSave + 1, object, false);
			InfoSave.clientJuridica(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static PersonaJuridica createPersonaJuridica(String companyName, String ruc, String[] adress, String phoneNumber, String email, Persona representative, String incorporationDoc) {
		try {
			int sizeofSave = InfoRead.clientJuridica();
			PersonaJuridica object = new PersonaJuridica(companyName, ruc, adress, phoneNumber, email, representative, incorporationDoc);
			DataSave.saveClientJuridica(sizeofSave + 1, object, false);
			InfoSave.clientJuridica(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}
}
