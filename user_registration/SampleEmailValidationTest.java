package user_registration;

import org.junit.Assert;
import org.junit.Test;

public class SampleEmailValidationTest {

	@Test
	public void givenEmail1_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc@yahoo.com");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail2_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc-100@yahoo.com");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail3_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc.100@yahoo.com");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail4_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc111@abc.com");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail5_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc-100@abc.net");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail6_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc.100@abc.com.au");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail7_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc@1.com");
		Assert.assertFalse(result);

	}

	@Test
	public void givenEmail8_WhenProper_ShouldReturnTrue() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc@gmail.com.com");
		Assert.assertTrue(result);

	}

	@Test
	public void givenEmail9_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc+100@gmail.com");
		Assert.assertFalse(result);

	}

	@Test
	public void givenEmai10_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc");
		Assert.assertFalse(result);

	}

	@Test
	public void givenEmail11_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc@%*.com");
		Assert.assertFalse(result);

	}

	@Test
	public void givenEmail12_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc()*@gmail.com");
		Assert.assertFalse(result);

	}

	@Test
	public void givenEmail13_WhenProper_ShouldReturnFalse() {
		SampleEmailValidation sampleEmailValidation = new SampleEmailValidation();
		boolean result = sampleEmailValidation.validateEmails("abc..2002@gmail.com");
		Assert.assertFalse(result);

	}
}
