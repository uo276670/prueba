package ips.ips2022.util;

public class Arguments {
	public static final String EMPTY_FIELD_MESSAGE = "No puede haber campos en blanco";
	public static final String INVALID_NUMBER_MESSAGE = "'%s' debe ser un número entero";
	public static final String NULL_PARAMETER_MESSAGE = "No se admiten nulos";
	
	public static void checkFieldNotEmpty(String str) throws AppCheckedException {
		checkFieldNotEmpty(str, EMPTY_FIELD_MESSAGE);
	}
	
	public static void checkFieldNotEmpty(String str, String message) throws AppCheckedException {
		if (str == null || str.isBlank()) {
			throw new AppCheckedException(message);
		}
	}
	
	public static void checkValidNumber(String str) throws AppCheckedException {
		checkValidNumber(str, String.format(INVALID_NUMBER_MESSAGE, str));
	}
	
	public static void checkValidNumber(String str, String message) throws AppCheckedException {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new AppCheckedException(message);
		}
	}
	
	public static void checkParameterNotNull(Object obj, String message) {
		if (obj == null) {
			throw new IllegalArgumentException(message);
		}
	}
	
	public static void checkParameterNotNull(Object obj) {
		checkParameterNotNull(obj, NULL_PARAMETER_MESSAGE);
	}
}
