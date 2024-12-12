package functions;

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
}
