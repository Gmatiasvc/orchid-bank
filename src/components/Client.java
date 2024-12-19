package components;

import common.data.constants;
import common.exceptions.AccountNotFound;
import common.exceptions.DataMissmatch;
import common.exceptions.InvalidInput;
import common.logger.Logger;
import functions.operationHandling;
import java.util.ArrayList;
import objects.accounts.Cuenta;
import objects.lists.ListaCuentasAhorro;
import objects.lists.ListaCuentasCorrientes;
import objects.lists.ListaOperaciones;

@SuppressWarnings("FieldMayBeFinal")
public class Client {
    private String ID_STRING;
	private ArrayList<Cuenta> listaCuentasPropias = new ArrayList<>();
	private ListaCuentasAhorro listaCuentasAhorro = new ListaCuentasAhorro();
	private ListaCuentasCorrientes listaCuentasCorrientes = new ListaCuentasCorrientes();
	private ListaOperaciones listaOperacionesPropias;
	private Logger logger = new Logger(false);
	public Client(String ID_STRING) {
		this.ID_STRING = ID_STRING;
		fillArrayList();
	}

	public String getID_STRING() {
		return ID_STRING;
	}

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentasPropias;
	}

	public void setID_STRING(String ID_STRING) {
		this.ID_STRING = ID_STRING;
		fillArrayList();
	}

	private boolean fillArrayList(){
		logger.INFO("User "+getID_STRING()+" started loading account information");
		for (Cuenta i : listaCuentasAhorro.getList()) {
			if (i.getId().equals(ID_STRING)){
				listaCuentasPropias.add(i);
				logger.INFO("Loaded account: "+i.getNumeroCuenta());
			}
		}
		
		for (Cuenta i : listaCuentasCorrientes.getList()) {
			if (i.getId().equals(ID_STRING)){
				listaCuentasPropias.add(i);
				logger.INFO("Loaded account: "+i.getNumeroCuenta());

			}
		}
		logger.INFO("User "+getID_STRING()+" finished loading account information");
		return true;
	}

	public boolean doTransfer(float monto, String accs, String accr) throws AccountNotFound, DataMissmatch, InvalidInput{
		
        if (accs.charAt(0) != '1' || accs.charAt(0) != '2'||accs.length()!=8) {
			logger.WARN("Tranfer operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
			throw new AccountNotFound();
			
		} else {
			if (accr.charAt(0) != '1' || accr.charAt(0) != '2'||accr.length()!=8){
				logger.WARN("Tranfer operation unable to proceed as provided account number: "+accr+" is invalid. Amount to transfer indicated: "+monto + " from the account: "+accs);
				throw new AccountNotFound();
			}
			for (Cuenta i: listaCuentasPropias) {
				if (i.getNumeroCuenta().equals(accs)){
					if (accr.charAt(0) == '1'){
						for (Cuenta j : listaCuentasAhorro.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "0");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
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
						for (Cuenta j : listaCuentasCorrientes.getList()) {
							if (j.getNumeroCuenta().equals(accr)){
								if (i.getBalance() >= monto*constants.ITF && i.getCurrency().equals(j.getCurrency())) {
									operationHandling.registerTransferenciaSaliente(accr, accs, monto, "1");
									operationHandling.registerTransferenciaEntrante(accr, accs, monto, "0");
									i.setBalance(i.getBalance()-monto*constants.ITF);
									j.setBalance(j.getBalance()+monto);
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
			logger.WARN("Tranfer operation unable to proceed as provided account number: "+accs+" is invalid. Amount to transfer indicated: "+monto + " to the account: "+accr);
			throw new AccountNotFound();
		}
	}

	public boolean setListaOperacionesPropias(String acc){
		for (Cuenta i : listaCuentasPropias) {
			if (i.getNumeroCuenta().equals(acc)){
				listaOperacionesPropias = new ListaOperaciones(acc, logger);
				logger.INFO("Operation logs from account "+acc+" have been obtained sucessfuly");
				return true;
			}
		}
		logger.WARN("Operation logs from account "+acc+" have not been obtained. Either the account is not from the user or it does not exist");
		return false;
	}

	public ListaOperaciones getListaOperacionesPropias(String acc) {
		logger.INFO("Operation list have been requested from a client component for the account: "+acc);
		setListaOperacionesPropias(acc);
		return listaOperacionesPropias;
	}
}
