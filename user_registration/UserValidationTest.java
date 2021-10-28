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

}