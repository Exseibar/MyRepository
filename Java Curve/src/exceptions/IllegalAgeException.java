package exceptions;

public class IllegalAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	// to add CTORS from super class(Exception) use:
	// source => generate CTORS from super class

	public IllegalAgeException() {
		super();

	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);

	}

	public IllegalAgeException(String message) {
		super(message);

	}

	public IllegalAgeException(Throwable cause) {
		super(cause);

	}

}
