package user_registration;

import org.junit.Assert;
import org.junit.Test;
//import user_registration.InvalidException;
//import user_registration.UserDetailsException;

public class ExceptionTest {

	@Test
	public void givenFirstName_CheckValidationForFirstName_ReturnTrue() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateName("Kalyan");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDNAME, e.type);
		}
	}

	@Test
	public void givenFirstLetterSmall_CheckForValidationForLastName_ReturnFalse() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateName("kalyan");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDNAME, e.type);
		}
	}

	@Test
	public void givenEmail_CheckValidation_ReturnTrue() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateEmail("abc.xyz@bl.com");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDEMAIL, e.type);
		}
	}

	@Test
	public void givenEmailWithoutTld_CheckValidation_ReturnFalse() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateEmail("abc.xyz@bl");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDEMAIL, e.type);
		}
	}

	@Test
	public void givenMobileNumber_CheckForValidation_ReturnTrue() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateMobileNumber("98 9989745621");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDMOBILENUMBER, e.type);
		}
	}

	@Test
	public void givenNumberWithoutCC_CheckForValidation_ReturnFalse() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validateMobileNumber("9625567575");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDMOBILENUMBER, e.type);
		}
	}

	@Test
	public void givenPassWordWithoutSpecialSymbol_CheckForValidation_ReturnFalse() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validatePassWord("kalyan123");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDPASSWORD, e.type);
		}
	}

	@Test
	public void givenProperPassWord_CheckForValidity_ReturnTrue() {
		UserDetailsException userDetails = new UserDetailsException();
		try {
			userDetails.validatePassWord("Kalyan@123");
		} catch (InvalidException e) {
			Assert.assertEquals(InvalidException.ExceptionType.INVALIDPASSWORD, e.type);
		}
	}
}