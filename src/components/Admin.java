package components;

import common.exceptions.AccountNotFound;
import common.exceptions.BadStringToParse;
import common.exceptions.ClientNotFound;
import common.logger.Logger;
import java.util.ArrayList;
import objects.accounts.Cuenta;
import objects.accounts.Persona;
import objects.accounts.PersonaJuridica;
import objects.lists.ListaClientesJuridicos;
import objects.lists.ListaClientesNaturales;
import objects.lists.ListaCuentasAhorro;
import objects.lists.ListaCuentasCorrientes;

@SuppressWarnings("FieldMayBeFinal")
public class Admin {
	private ListaCuentasAhorro listaAhorro = new ListaCuentasAhorro();
	private ListaCuentasCorrientes listaCorriente = new ListaCuentasCorrientes();
	private ListaClientesJuridicos listaJuridicos = new ListaClientesJuridicos();
	private ListaClientesNaturales listaNaturales = new ListaClientesNaturales();
	private ArrayList<String> listaNrosCuenta = new ArrayList<>();
	private ArrayList<String> listaNrosDoc = new ArrayList<>();
	private Logger logger = new Logger(true);

	
	@SuppressWarnings("OverridableMethodCallInConstructor")
	public Admin() {
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
		if (acc.charAt(0)== '0' || acc.charAt(0) == '1' || acc.length() != 8){
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

	public ArrayList<String> getLog(String year, String month, String day){
		logger.INFO("Method getLog called from an admin component");
		return Logger.readLog(year, month, day, logger);
	}
}