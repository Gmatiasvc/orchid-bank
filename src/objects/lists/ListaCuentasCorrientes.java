package objects.lists;

import database.DataRead;
import database.InfoRead;
import java.util.LinkedList;
import objects.accounts.CuentaCorriente;

public class ListaCuentasCorrientes {

	@SuppressWarnings("FieldMayBeFinal")
	private LinkedList<CuentaCorriente> list = new LinkedList<>();

	public ListaCuentasCorrientes() {
		int dbsize = InfoRead.accountCorriente();
		CuentaCorriente ccrt;
		for (int i = 0; i <= dbsize; i++) {
			ccrt = DataRead.readCuentaCorriente(i, false);
			if (ccrt.getNumber() != null || !"null".equals(ccrt.getNumber()) || !"".equals(ccrt.getNumber())) {
				list.add(ccrt);
			}
		}
	}

	public LinkedList<CuentaCorriente> getList() {
		return list;
	}

	public int getSize() {
		return list.size();
	}

	public boolean addAccount(CuentaCorriente ccrt) {
		if (ccrt.getNumber() != null || !"null".equals(ccrt.getNumber()) || !"".equals(ccrt.getNumber())) {
			list.add(ccrt);
			return true;
		}
		return false;
	}

	public CuentaCorriente getFromIndex(int index) {
		try {
			return list.get(index);
		} catch (IndexOutOfBoundsException e) {
			String[] empty3 = {null, null, null};
			return new CuentaCorriente(0, 0, 0, null, 0, null, empty3, null, 0, 0, null, null);

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

	public int getIndexFromObject(CuentaCorriente ccrt) {
		return list.indexOf(ccrt);
	}

	public int getIndexFromNumber(String str) {
		for (int i = 0; i < getSize(); i++) {
			if ((getFromIndex(i).getNumber().equals(str))) {
				return i;
			}
		}
		return -1;
	}
}
