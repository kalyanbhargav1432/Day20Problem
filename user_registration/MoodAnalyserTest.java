package user_registration;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WHENSad_ShouldReturnTrue() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("  This is sad message");

		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WHENHappy_ShouldReturnTrue() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood(" This is Happy message");

		Assert.assertEquals("Happy", mood);
	}

}