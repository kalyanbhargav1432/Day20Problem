package user_registration;

import java.util.regex.Pattern;

public class UserValidation {
	private static final String FIRSTNAME = "^([A-Z]{1}[a-z]{2,})";

	public boolean validateFirstName(String fname) {
		Pattern pattern = Pattern.compile(FIRSTNAME);
		return pattern.matcher(fname).matches();
	}
}