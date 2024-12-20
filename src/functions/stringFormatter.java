package functions;

import database.InfoRead;

public class stringFormatter {

	private static final int SIZE_MONTO = 8;

	public static String montoFormatter(int monto) {
		String str = Integer.toString(monto);
		if (str.length() < 8) {
			return String.format("%1$" + SIZE_MONTO + "s", str).replace(' ', '0');
		} else if (str.length() > 8) {
			return str.substring(str.length() - 8, str.length());
		} else {
			return str;
		}
	}

	public static String montoFormatter(float monto) {
		String str = Float.toString(monto);
		if (str.length() < 8) {
			return String.format("%1$" + SIZE_MONTO + "s", str).replace(' ', '0');
		} else if (str.length() > 8) {
			return str.substring(str.length() - 8, str.length());
		} else {
			return str;
		}
	}

	public static String montoFormatter(double monto) {
		String str = Double.toString(monto);
		if (str.length() < 8) {
			return String.format("%1$" + SIZE_MONTO + "s", str).replace(' ', '0');
		} else if (str.length() > 8) {
			return str.substring(str.length() - 8, str.length());
		} else {
			return str;
		}
	}

	public static String pidGenerator() {
		String str = Double.toString(System.currentTimeMillis());

		return str.substring(str.length() - 13, str.length() - 3);
	}

	public static String numberGeneratorAhorro(){
		int aca = InfoRead.accountAhorro()+1;
		String acats = Integer.toString(aca);
		return "1"+"0".repeat(7-acats.length())+acats;
	}

	public static String numberGeneratorCorriente(){
		int acc = InfoRead.accountCorriente()+1;
		String accts = Integer.toString(acc);
		return "1"+"0".repeat(7-accts.length())+accts;
	}
}
