package user_registration;

import java.util.regex.*;

public class UserDetailsException extends Exception {

	private final static String FIRSTNAME = "([A-Z][a-zA-Z]{2,})$";
	private final static String EMAILPATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private final static String MOBILENUMBER = "^(\\d{2})( )([6-9]{1})(\\d{9})";
	private final static String PASSWORD = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]{1})(?=\\S+$).{8,}";
	private String exception;

	public void validateName(String name) throws InvalidException {
		this.exception = name;
		validateName();
	}

	public boolean validateName() throws InvalidException {
		try {
			Pattern pattern = Pattern.compile(FIRSTNAME);
			if (pattern.matcher(exception).matches())
				return true;
			else
				throw new InvalidException(InvalidException.ExceptionType.INVALIDNAME, "Please enter valid FirstName");
		} catch (NullPointerException e) {
			throw new InvalidException(InvalidException.ExceptionType.ENTEREDNULL, "Enter valid FirstName");
		}
	}

	public boolean validateEmail(String email) throws InvalidException {
		try {
			Pattern pattern = Pattern.compile(EMAILPATTERN);
			if (pattern.matcher(email).matches())
				return true;
			else
				throw new InvalidException(InvalidException.ExceptionType.INVALIDEMAIL, "Please enter valid Email");
		} catch (NullPointerException e) {
			throw new InvalidException(InvalidException.ExceptionType.ENTEREDNULL, "Please enter valid Email");
		}
	}

	public boolean validateMobileNumber(String mobileNumber) throws InvalidException {
		try {
			Pattern pattern = Pattern.compile(MOBILENUMBER);
			if (pattern.matcher(mobileNumber).matches())
				return true;
			else
				throw new InvalidException(InvalidException.ExceptionType.INVALIDMOBILENUMBER,
						"Please enter valid Mobile Number");
		} catch (NullPointerException e) {
			throw new InvalidException(InvalidException.ExceptionType.ENTEREDNULL, "Please enter valid Mobile Number");
		}
	}

	public boolean validatePassWord(String passWord) throws InvalidException {
		try {
			Pattern pattern = Pattern.compile(PASSWORD);
			if (pattern.matcher(passWord).matches())
				return true;
			else
				throw new InvalidException(InvalidException.ExceptionType.INVALIDPASSWORD,
						"Please enter valid PassWord");
		} catch (NullPointerException e) {
			throw new InvalidException(InvalidException.ExceptionType.ENTEREDNULL, "Please enter valid PassWord");
		}
	}
}