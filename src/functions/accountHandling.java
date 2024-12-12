package functions;

import database.DataSave;
import database.InfoRead;
import database.InfoSave;
import java.util.ArrayList;
import objects.accounts.CuentaAhorro;
import objects.accounts.CuentaCorriente;

public class accountHandling {

	public static CuentaCorriente createCorriente(float overdraftLimit, float chequeLimit, float chequeNumberLimit, String checkbookNumber, float chequeCommission, String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype) {
		try {
			int sizeofSave = InfoRead.accountCorriente();
			CuentaCorriente object = new CuentaCorriente(overdraftLimit, chequeLimit, chequeNumberLimit, checkbookNumber, chequeCommission, number, creationDate, currency, balance, interestRate, id, idtype);
			DataSave.saveAccountCorriente(sizeofSave + 1, object, false);
			InfoSave.accountCorriente(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static CuentaCorriente createCorriente(float overdraftLimit, float chequeLimit, float chequeNumberLimit, String checkbookNumber, float chequeCommission, String number, String year, String month, String day, String currency, double balance, float interestRate, String id, String idtype) {
		try {
			String[] creationDate = {year, month, day};
			int sizeofSave = InfoRead.accountCorriente();
			CuentaCorriente object = new CuentaCorriente(overdraftLimit, chequeLimit, chequeNumberLimit, checkbookNumber, chequeCommission, number, creationDate, currency, balance, interestRate, id, idtype);
			DataSave.saveAccountCorriente(sizeofSave + 1, object, false);
			InfoSave.accountCorriente(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static CuentaAhorro createAhorro(float withdrawLim, String statementDay, String statementPeriod, String gracePeriod, ArrayList<String> beneficiaries, String number, String[] creationDate, String currency, double balance, float interestRate, String id, String idtype) {
		try {
			int sizeofSave = InfoRead.accountAhorro();
			CuentaAhorro object = new CuentaAhorro(withdrawLim, statementDay, statementPeriod, gracePeriod, beneficiaries, number, creationDate, currency, balance, interestRate, id, idtype);
			DataSave.saveAccountAhorro(sizeofSave + 1, object, false);
			InfoSave.accountAhorro(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}

	public static CuentaAhorro createAhorro(float withdrawLim, String statementDay, String statementPeriod, String gracePeriod, ArrayList<String> beneficiaries, String number, String year, String month, String day, String currency, double balance, float interestRate, String id, String idtype) {
		try {
			String[] creationDate = {year, month, day};
			int sizeofSave = InfoRead.accountAhorro();
			CuentaAhorro object = new CuentaAhorro(withdrawLim, statementDay, statementPeriod, gracePeriod, beneficiaries, number, creationDate, currency, balance, interestRate, id, idtype);
			DataSave.saveAccountAhorro(sizeofSave + 1, object, false);
			InfoSave.accountAhorro(sizeofSave + 1, false);
			return object;
		} catch (Exception e) {
			return null;
		}
	}
}
