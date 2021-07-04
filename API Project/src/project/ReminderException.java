package project;

public class ReminderException extends Exception {

	private static final long serialVersionUID = 1L;

	public ReminderException() {
		super();
	}

	public ReminderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ReminderException(String message, Throwable cause) {
		super(message, cause);
	}

	public ReminderException(String message) {
		super(message);
	}

	public ReminderException(Throwable cause) {
		super(cause);
	}

}
