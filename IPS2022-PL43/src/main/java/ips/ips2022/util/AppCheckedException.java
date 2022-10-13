package ips.ips2022.util;

public class AppCheckedException extends Exception {
	private static final long serialVersionUID = -6356558372621934024L;
	public AppCheckedException(Throwable e) {
		super(e);
	}
	public AppCheckedException(String s) {
		super(s);
	}
}
