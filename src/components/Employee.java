package components;

import common.data.constants;
import common.exceptions.AccountNotFound;
import common.exceptions.BadStringToParse;
import common.exceptions.ClientNotFound;
import common.exceptions.DataMissmatch;
import common.exceptions.InvalidInput;
import common.logger.Logger;
import database.DataSave;
import functions.accountHandling;
import functions.clientHandling;
import functions.operationHandling;
import java.util.ArrayList;
import objects.accounts.Cuenta;
import objects.accounts.CuentaAhorro;
import objects.accounts.CuentaCorriente;
import objects.accounts.Persona;
import objects.accounts.PersonaJuridica;
import objects.lists.ListaClientesJuridicos;
import objects.lists.ListaClientesNaturales;
import objects.lists.ListaCuentasAhorro;
import objects.lists.ListaCuentasCorrientes;

@SuppressWarnings("FieldMayBeFinal")
public class Employee {
	private ListaCuentasAhorro listaAhorro = new ListaCuentasAhorro();
	private ListaCuentasCorrientes listaCorriente = new ListaCuentasCorrientes();
	private ListaClientesJuridicos listaJuridicos = new ListaClientesJuridicos();
	private ListaClientesNaturales listaNaturales = new ListaClientesNaturales();
	private ArrayList<String> listaNrosCuenta = new ArrayList<>();
	private ArrayList<String> listaNrosDoc = new ArrayList<>();
	private Logger logger = new Logger(true);
	
	
    @SuppressWarnings("OverridableMethodCallInConstructor")
	public Employee() {
		fillListaNrosCuenta();
		fillListaNrosDoc();
	}

	public void fillListaNrosCuenta(){
		logger.INFO("fillListaNrosCuenta method called");
		listaNrosCuenta.clear();
		for (Cuenta i : listaAhorro.getList()) {
			listaNrosCuenta.add(i.getNumeroCuenta());
		}
		for (Cuenta i : listaCorriente.getList()) {
			listaNrosCuenta.add(i.getNumeroCuenta());
		}
		logger.INFO("fillListaNrosCuenta method finished");
	}

	public void fillListaNrosDoc(){
		logger.INFO("fillListaNrosDoc method called");
		listaNrosDoc.clear();
		for (Persona i : listaNaturales.getList()) {
			listaNrosDoc.add(i.getIdString());
		}
		for (PersonaJuridica i : listaJuridicos.getList()) {
			listaNrosDoc.add(i.getRuc());
		}
		logger.INFO("fillListaNrosDoc method finished");
	}

public ArrayList<String> getListaNrosCuenta() {
		return listaNrosCuenta;
	}

	public ArrayList<String> getListaNrosDoc() {
		return listaNrosDoc;
	}

	public Persona searchNatural(String docIdent) throws ClientNotFound{
		logger.INFO("searchNatural method called, with a id number of: "+docIdent+" as argument");
		for (Persona i : listaNaturales.getList()) {
			if(i.getIdString().equals(docIdent)){
				return i;
			}
		}
		throw new ClientNotFound();
	}

	public PersonaJuridica searchJuridica(String ruc) throws ClientNotFound{
		logger.INFO("searchJuridica method called, with a ruc number of: "+ruc+" as argument");
		for (PersonaJuridica i : listaJuridicos.getList()) {
			if(i.getRuc().equals(ruc)){
				return i;
			}
		}
		throw new ClientNotFound();
	}

	public Cuenta searchCuenta(String acc) throws AccountNotFound, BadStringToParse{
		if (acc.charAt(0) != '1' && acc.charAt(0) != '2' && acc.length() != 8){
			System.out.println("ERROR DEBUG: " + acc +" - "+acc.charAt(0));
			logger.WARN("searchCuenta method exited with an exeption as the account number: "+acc+" provided was invalid");
			throw new BadStringToParse();
		}
		for (Cuenta i : listaCorriente.getList()) {
			if(i.getNumeroCuenta().equals(acc)){
				logger.INFO("searchCuenta method returned an object with account number: "+acc);
				return i;
			}
		}
		for (Cuenta i : listaAhorro.getList()) {
			if(i.getNumeroCuenta().equals(acc)){
				logger.INFO("searchCuenta method returned an object with account number: "+acc);
				return i;
			}
		}
		logger.WARN("searchCuenta method exited with an exeption as the account number: "+acc+" was not found in the account lists");
		throw new AccountNotFound();
	}
	
	public boolean createNatural(String name, String surname, String idString, String idType, String year, String month, String day, String state, String region, String district, String street, String phoneNumber, String email, String civilStatus) throws InvalidInput{
		logger.INFO("createNatural method called from an Employee type component");
		if (listaNrosDoc.contains(idString)){
			logger.WARN("createNatural method failed because the idString was already registered");
			throw new InvalidInput();

		}
		Persona obj = clientHandling.createNatural(name, surname, idString, idType, year, month, day, state, region, district, street, phoneNumber, email, civilStatus);
		if (obj == null) {
			logger.ERROR("createNatural method failed to create the Persona object");
			return false;
		}
		else{
			listaNaturales.addAccount(obj);
			return true;
		}
	}

	public boolean createNatural(String name, String surname, String idString, String idType, String[] dayOfBirth, String[] adress, String phoneNumber, String email, String civilStatus) throws InvalidInput{
		logger.INFO("createNatural method called from an Employee type component");
		if (listaNrosDoc.contains(idString)){
			logger.WARN("createNatural method failed because the idString provided was already registered");
			throw new InvalidInput();

		}
		Persona obj = clientHandling.createNatural(surname, surname, idString, idType, dayOfBirth, adress, phoneNumber, email, civilStatus);
		if (obj == null) {
			logger.ERROR("createNatural method failed to create the Persona object");
			return false;
		}
		else{
			listaNaturales.addAccount(obj);
			return true;
		}
	}

	public boolean createJurica(String companyName, String ruc, String state, String region, String district, String street, String phoneNumber, String email, Persona representative, String incorporationDoc) throws InvalidInput{
		logger.INFO("createJurica method called from an Employee type component");
		if (listaNrosDoc.contains(ruc)){
			logger.WARN("createJurica method failed because the ruc provided was already registered");
			throw new InvalidInput();
		}
		PersonaJuridica obj = clientHandling.createPersonaJuridica(companyName, ruc, state, region, district, street, phoneNumber, email, representative, incorporationDoc);
		if (obj == null) {
			logger.ERROR("createJurica method failed to create the Persona object");
			return false;
		}
		else{
			listaJuridicos.addAccount(obj);
			return true;
		}
	}

	public boolean createJurica(String companyName, String ruc, String[] adress, String phoneNumber, String email, Persona representative, String incorporationDoc) throws InvalidInput{
		logger.INFO("createJurica method called from an Employee type component");
		if (listaNrosDoc.contains(ruc)){
			logger.WARN("createJurica method failed because the ruc provided was already registered");
			throw new InvalidInput();

		}
		PersonaJuridica obj = clientHandling.createPersonaJuridica(companyName, ruc, adress, phoneNumber, email, representative, incorporationDoc);
		if (obj == null) {
			logger.ERROR("createJurica method failed to create the Persona object");
			return false;
		}
		else{
			listaJuridicos.addAccount(obj);
			return true;
		}
	}


	public boolean doTransfer(float monto, String accs, String accr) throws AccountNotFound, DataMissmatch, InvalidInput{
		
        if (accs.charAt(0) != '1' && accs.charAt(0) != '2'&&accs.length()!=8) {
			logger.WARN("Tranfer operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
			throw new AccountNotFound();
			
		} else {
			if (accr.charAt(0) != '1' && accr.charAt(0) != '2'&&accr.length()!=8){
				logger.WARN("Tranfer operation unable to proceed as provided account number: "+accr+" is invalid. Amount to transfer indicated: "+monto + " from the account: "+accs);
				throw new AccountNotFound();
			}
			if (accs.charAt(0)=='1'){ 
			for (Cuenta i: listaAhorro.getList()) {
				if (i.getNumeroCuenta().equals(accs)){
					if (accr.charAt(0) == '1'){
						for (Cuenta j : listaAhorro.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "0");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
									DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
									DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)j), (CuentaAhorro)j, false);

									logger.INFO("Tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
									return true;
								}
								else {
									if (i.getBalance() < monto*constants.ITF){
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
										throw new InvalidInput();
								}
									else {
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
										throw new DataMissmatch();
									}
								}
							}
						}
					}
					else{
						for (Cuenta j : listaCorriente.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "1");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
									logger.INFO("Tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
									DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
									DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)j), (CuentaCorriente)j, false);
									return true;
								}
								else {
									if (i.getBalance() < monto*constants.ITF){
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
										throw new InvalidInput();
								}
									else {
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
										throw new DataMissmatch();
									}
								}
							}
						}
					}
				}
			}	
		}
		else {
			for (Cuenta i: listaCorriente.getList()) {
				if (i.getNumeroCuenta().equals(accs)){
					if (accr.charAt(0) == '1'){
						for (Cuenta j : listaAhorro.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "0");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
									logger.INFO("Tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
									DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
									DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)j), (CuentaAhorro)j, false);
									return true;
								}
								else {
									if (i.getBalance() < monto*constants.ITF){
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
										throw new InvalidInput();
								}
									else {
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
										throw new DataMissmatch();
									}
								}
							}
						}
					}
					else{
						for (Cuenta j : listaCorriente.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "1");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
									DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
									DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)j), (CuentaCorriente)j, false);
									
									logger.INFO("Tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
									return true;
								}
								else {
									if (i.getBalance() < monto*constants.ITF){
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
										throw new InvalidInput();
								}
									else {
										logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
										throw new DataMissmatch();
									}
								}
							}
						}
					}
				}
			}	
		
		}
			
			logger.WARN("Tranfer operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
			throw new AccountNotFound();
		}
	}

	public boolean createCorriente(float overdraftLimit, float chequeLimit, float chequeNumberLimit, String checkbookNumber, float chequeCommission, String number, String year, String month, String day, String currency, double balance, float interestRate, String id, String idtype){
		logger.INFO("createCorriente method called from an Employee type component");
		
		CuentaCorriente obj = accountHandling.createCorriente(overdraftLimit, chequeLimit, chequeNumberLimit, checkbookNumber, chequeCommission, number, year, month, day, currency, balance, interestRate, id, idtype);
		if (obj == null) {
			logger.ERROR("createCorriente method failed to create the CuentaCorriente object");
			return false;
		}
		else{
			listaCorriente.addAccount(obj);
			return true;
		}
	}

	public boolean createAhorro(float withdrawLim, String statementDay, String statementPeriod, String gracePeriod, ArrayList<String> beneficiaries, String number, String year, String month, String day, String currency, double balance, float interestRate, String id, String idtype){
		logger.INFO("createCorriente method called from an Employee type component");
		
		CuentaAhorro obj = accountHandling.createAhorro(withdrawLim, statementDay, statementPeriod, gracePeriod, beneficiaries, number, year, month, day,  currency, balance, interestRate, id, idtype);
		if (obj == null) {
			logger.ERROR("createCorriente method failed to create the CuentaCorriente object");
			return false;
		}
		else{
			listaAhorro.addAccount(obj);
			return true;
		}
	}

	public Logger getLogger() {
		return logger;
	}
	
	public ListaClientesNaturales getListaNaturales() {
		return listaNaturales;
	}

	public boolean doWithdraw(float monto, String acc,String docstr) throws AccountNotFound, InvalidInput{
		if (acc.charAt(0) != '1' && acc.charAt(0) != '2'&&acc.length()!=8) {
			logger.WARN("Withdraw operation unable to proceed as provided account number: "+acc+" is invalid. Amount to withdraw indicated: "+monto);
			throw new AccountNotFound();
		}
        

		if(acc.charAt(0)=='1'){
			for(CuentaAhorro i : listaAhorro.getList()){
				if (i.getNumeroCuenta().equals(acc)){
					if(i.getBalance()>=monto*constants.ITF && i.getWithdrawLim()>=monto*constants.ITF){
						operationHandling.registerRetiro(monto, "1", acc, docstr);
						i.setBalance(i.getBalance()-monto*constants.ITF);
						DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
						return true;
					}

					else{
					operationHandling.registerRetiro(monto, "0", acc, docstr);
					logger.WARN("Withdraw operation from "+ acc+" failed due to a lack of funds");
					throw new InvalidInput();}
				}
			}
		}
		else{
			for(CuentaCorriente i : listaCorriente.getList()){
				if (i.getNumeroCuenta().equals(acc)){
					if(i.getBalance()>=monto*constants.ITF ){
						operationHandling.registerRetiro(monto, "1", acc, docstr);
						i.setBalance(i.getBalance()-monto*constants.ITF);
						DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
						return true;
					}

					else{
					operationHandling.registerRetiro(monto, "0", acc, docstr);
					logger.WARN("Withdraw operation from "+ acc+" failed due to a lack of funds");
					throw new InvalidInput();}
				}
				
			}
		}
	return false;
	}


	public boolean doDeposit(float monto, String acc,String docstr) throws AccountNotFound, InvalidInput{
        if (acc.charAt(0) != '1' && acc.charAt(0) != '2'&&acc.length()!=8) {
			logger.WARN("Withdraw operation unable to proceed as provided account number: "+acc+" is invalid. Amount to withdraw indicated: "+monto);
			throw new AccountNotFound();
		}

		if(acc.charAt(0)=='1'){
			for(CuentaAhorro i : listaAhorro.getList()){
				if (i.getNumeroCuenta().equals(acc)){
					operationHandling.registerDeposito(monto, "1", acc, docstr);
					i.setBalance(i.getBalance()-monto-(monto*(constants.ITF-1)));
					DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
					return true;
			
				}
			}
		}
		else{
			for(CuentaCorriente i : listaCorriente.getList()){
				if (i.getNumeroCuenta().equals(acc)){
					operationHandling.registerDeposito(monto, "1", acc, docstr);
					i.setBalance(i.getBalance()+monto-(monto*(constants.ITF-1)));
					DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
					return true;
				}
				
			}
		}
	return false;
	}

	public boolean doCheque(float monto, String accs, String accr, String doc) throws AccountNotFound, DataMissmatch, InvalidInput {
		
			if (accs.charAt(0) != '1' && accs.charAt(0) != '2'&&accs.length()!=8) {
				logger.WARN("Cheque operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
				throw new AccountNotFound();
				
			} else {
				if (accr.charAt(0) != '1' && accr.charAt(0) != '2'&&accr.length()!=8){
					logger.WARN("Cheque operation unable to proceed as provided account number: "+accr+" is invalid. Amount to transfer indicated: "+monto + " from the account: "+accs);
					throw new AccountNotFound();
				}
				if (accs.charAt(0)=='1'){ 
				for (Cuenta i: listaAhorro.getList()) {
					if (i.getNumeroCuenta().equals(accs)){
						if (accr.charAt(0) == '1'){
							for (Cuenta j : listaAhorro.getList()) {
								if (j.getNumeroCuenta().equals(accr)){
									if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
										operationHandling.registerChequeSaliente(accr,accs,doc,accs,monto,"1");
										operationHandling.registerChequeEntrante(accs,accr,doc,accs,monto,"1");
										i.setBalance(i.getBalance()-monto*constants.ITF);
										j.setBalance(j.getBalance()+monto);
										DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
										DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)j), (CuentaAhorro)j, false);
	
										logger.INFO("Cheque tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
										return true;
									}
									else {
										if (i.getBalance() < monto*constants.ITF){
											logger.WARN("Cheque transfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
											throw new InvalidInput();
									}
										else {
											logger.WARN("Cheque tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
											throw new DataMissmatch();
										}
									}
								}
							}
						}
						else{
							for (Cuenta j : listaCorriente.getList()) {
								if (j.getNumeroCuenta().equals(accr)){
									if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
										operationHandling.registerChequeSaliente(accr,accs,doc,accs,monto,"1");
										operationHandling.registerChequeEntrante(accs,accr,doc,accs,monto,"1");
										i.setBalance(i.getBalance()-monto*constants.ITF);
										j.setBalance(j.getBalance()+monto);
										logger.INFO("Cheque tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
										DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)i), (CuentaAhorro)i, false);
										DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)j), (CuentaCorriente)j, false);
										return true;
									}
									else {
										if (i.getBalance() < monto*constants.ITF){
											logger.WARN("Cheque tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
											throw new InvalidInput();
									}
										else {
											logger.WARN("Cheque tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
											throw new DataMissmatch();
										}
									}
								}
							}
						}
					}
				}	
			}
			else {
				for (Cuenta i: listaCorriente.getList()) {
					if (i.getNumeroCuenta().equals(accs)){
						if (accr.charAt(0) == '1'){
							for (Cuenta j : listaAhorro.getList()) {
								if (j.getNumeroCuenta().equals(accr)){
									if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
										operationHandling.registerChequeSaliente(accr,accs,doc,accs,monto,"1");
										operationHandling.registerChequeEntrante(accs,accr,doc,accs,monto,"1");
										i.setBalance(i.getBalance()-monto*constants.ITF);
										j.setBalance(j.getBalance()+monto);
										logger.INFO("Cheque tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
										DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
										DataSave.saveAccountAhorro(listaAhorro.getIndexFromObject((CuentaAhorro)j), (CuentaAhorro)j, false);
										return true;
									}
									else {
										if (i.getBalance() < monto*constants.ITF){
											logger.WARN("Cheque tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
											throw new InvalidInput();
									}
										else {
											logger.WARN("Cheque tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
											throw new DataMissmatch();
										}
									}
								}
							}
						}
						else{
							for (Cuenta j : listaCorriente.getList()) {
								if (j.getNumeroCuenta().equals(accr)){
									if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
										operationHandling.registerChequeSaliente(accr,accs,doc,accs,monto,"1");
										operationHandling.registerChequeEntrante(accs,accr,doc,accs,monto,"1");
										i.setBalance(i.getBalance()-monto*constants.ITF);
										j.setBalance(j.getBalance()+monto);
										DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)i), (CuentaCorriente)i, false);
										DataSave.saveAccountCorriente(listaCorriente.getIndexFromObject((CuentaCorriente)j), (CuentaCorriente)j, false);
										
										logger.INFO("Tranfer between accounts: "+accs+" -> "+accr +" was executed and registered sucessfuly, the ammount transfered was: "+monto);
										return true;
									}
									else {
										if (i.getBalance() < monto*constants.ITF){
											logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the requested quantity of money to tranfer: "+monto+ "exceded the balance of the account");
											throw new InvalidInput();
									}
										else {
											logger.WARN("Tranfer between accounts: "+accs+" -> "+accr +" failed, the currency of the accounts does not match");
											throw new DataMissmatch();
										}
									}
								}
							}
						}
					}
				}	
			
			}
				
				logger.WARN("Tranfer operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
				throw new AccountNotFound();
			}

	}

}