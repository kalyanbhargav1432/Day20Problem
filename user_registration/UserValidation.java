package user_registration;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String FIRSTNAME = "^([A-Z]{1}[a-z]{2,})";
	private static final String LASTNAME = "^([A-Z]{1}[a-z]{2,})";
	private static final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	private static final String MOBILENUMBER = "^(\\d{2})( )([7-9]{1})(\\d{9})";
	private static final String PASSWORD = "^([A-Z]{1}[a-zA-Z]{8,}[0-9]{2,})";

	public boolean validateFirstName(String firstName) {
		Pattern pattern = Pattern.compile(FIRSTNAME);
		return pattern.matcher(firstName).matches();
	}

	public boolean validateLastName(String lastName) {
		Pattern pattern = Pattern.compile(LASTNAME);
		return pattern.matcher(lastName).matches();
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL);
		return pattern.matcher(email).matches();
	}

	public boolean validateMobileNumber(String mobileNumber) {
		Pattern pattern = Pattern.compile(MOBILENUMBER);
		return pattern.matcher(mobileNumber).matches();
	}

	public boolean validatePassWord(String passWord) {
		Pattern pattern = Pattern.compile(PASSWORD);
		return pattern.matcher(passWord).matches();
	}
}