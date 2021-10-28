package user_registration;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String FIRSTNAME = "^([A-Z]{1}[a-z]{2,})";
	private static final String LASTNAME = "^([A-Z]{1}[a-z]{2,})";
	private static final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

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
}