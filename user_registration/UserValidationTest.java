package user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

	@Test
	public void givenFirstName_WhenProperShouldReturnTrue() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateFirstName("Kalyan");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstLetterSmallCheckForValidationReturnFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateFirstName("kalyan");
		Assert.assertFalse(result);
	}

	@Test
	public void givenTwoLettersCheckForValidationReturnFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateFirstName("ka");
		Assert.assertFalse(result);
	}

	@Test
	public void givenTwoLetterCheckForValidationForLastNameReturnTrue() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateFirstName("Tanniru");
		Assert.assertTrue(result);
	}

	@Test
	public void givenTwoSmallLettersCheckForValidationLastNameReturnFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateFirstName("tanniru");
		Assert.assertFalse(result);
	}

	@Test
	public void givenTwoSmallsCheckForValidationForEmailRerunTrue() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateEmail("abc.xyz@bl.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenTwoSmallsCheckForValidationForEmailRerunFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateEmail("abc.xyz@bl");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNumberCheckForValidationRerunTrue() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateMobileNumber("91 9876546789");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNumberCheckForValidationRerunFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validateMobileNumber("919876546789");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassWordCheckForValidationRule3RerunTrue() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validatePassWord("Kalyan123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassWordLessthan8LettersCheckForValidationRule3RerunFalse() {
		UserValidation validator = new UserValidation();
		boolean result = validator.validatePassWord("kalyan");
		Assert.assertFalse(result);
	}

}