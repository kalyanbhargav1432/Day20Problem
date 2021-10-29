package user_registration;

public class InvalidException extends Exception {
	public InvalidException(ExceptionType enteredNull) {
	}

	enum ExceptionType {
		INVALIDNAME, INVALIDEMAIL, INVALIDMOBILENUMBER, INVALIDPASSWORD, ENTEREDNULL
	}

	public ExceptionType type;

	public InvalidException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
