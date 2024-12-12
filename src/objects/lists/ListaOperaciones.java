package objects.lists;

import common.exceptions.BadStringToParse;
import common.logger.Logger;
import database.DataRead;
import java.util.ArrayList;
import java.util.LinkedList;
import objects.operations.Cheque;
import objects.operations.Deposito;
import objects.operations.Operacion;
import objects.operations.Retiro;
import objects.operations.Transferencia;

public class ListaOperaciones {

	@SuppressWarnings("FieldMayBeFinal")
	private LinkedList<Operacion> list = new LinkedList<>();
	private ArrayList<String> strList;

	private String accountNumber;

	public ListaOperaciones(String accountNumber, Logger logger) {
		this.accountNumber = accountNumber;
		setList(logger);
	}

	public LinkedList<Operacion> getList() {
		return list;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	private void setList(Logger logger) {
		strList = DataRead.readOperation(getAccountNumber(), false);
		if (strList.getLast() == null) {
			list.add(null);
		} else {
			for (String i : strList) {
				try {
					switch (i.substring(0, 1)) {
						case "0" -> {
							list.add(Deposito.parseFromString(i));
						}
						case "1" -> {
							list.add(Retiro.parseFromString(i));
						}
						case "2", "3" -> {
							list.add(Transferencia.parseFromString(i));
						}
						case "4", "5" -> {
							list.add(Cheque.parseFromString(i));
						}
						default -> {
							throw new BadStringToParse();
						}
					}
					logger.INFO("Operation information has been parsed sucessfully: " + i);
				} catch (BadStringToParse e) {
					logger.WARN("A string could not be parsed during operation data recovery from the db. String might be corrupted. Account: " + getAccountNumber());
				}
			}
		}
	}

	public void setList(LinkedList<Operacion> list) {
		this.list = list;
	}

	public void setAccountNumber(String accountNumber, Logger logger) {
		this.accountNumber = accountNumber;
		setList(logger);
	}
}
