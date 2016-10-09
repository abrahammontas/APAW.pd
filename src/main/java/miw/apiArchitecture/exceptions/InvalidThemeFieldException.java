package miw.apiArchitecture.exceptions;

public class InvalidThemeFieldException extends Exception {
	private static final long serialVersionUID = -642045799876625537L;
	public static final String DESCRIPTION = "La petición no ha sido implementada";

	public InvalidThemeFieldException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}

	public InvalidThemeFieldException() {
		this("");
	}

}
