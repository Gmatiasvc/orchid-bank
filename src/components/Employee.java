package components;

import common.logger.Logger;
import java.util.ArrayList;
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
    
}