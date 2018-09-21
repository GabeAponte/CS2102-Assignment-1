import static org.junit.Assert.*;

import org.junit.Test;

//CS2102 Homework 1: Gabriel Aponte
public class Examples {
	public Examples(){}

	ShootingRound one = new ShootingRound(1);
	ShootingRound two = new ShootingRound(2);
	ShootingRound three = new ShootingRound(3);
	ShootingRound four = new ShootingRound(4);
	ShootingRound five = new ShootingRound(5);

	ShootingResult ShootRes1 = new ShootingResult(five, four, four, three); //16
	ShootingResult ShootRes2 = new ShootingResult (three, one, five, two); //11
	ShootingResult ShootRes3 = new ShootingResult (two, two, three, two); //9
	ShootingResult ShootRes4 = new ShootingResult (one, four, one, two); //8

	SkiingResult firstSki = new SkiingResult (1, 20.0, 19.0, 18.0, 17.0, 16.0);
	SkiingResult secondSki = new SkiingResult (2, 30.0, 29.0, 28.0, 27.0, 26.0);
	SkiingResult thirdSki = new SkiingResult (3, 45.0, 44.0, 43.0, 37.0, 36.0);
	SkiingResult lastSki = new SkiingResult (6, 50.0, 49.0, 48.0, 47.0, 46.0);

	FinalResult First = new FinalResult (ShootRes1, firstSki);
	FinalResult Second = new FinalResult (ShootRes2, lastSki);
	FinalResult Third = new FinalResult (ShootRes4, secondSki);
	FinalResult Last = new FinalResult (ShootRes3, thirdSki);

	Athlete Joe = new Athlete (First);
	Athlete Bob = new Athlete (Second);
	Athlete Sam = new Athlete (Third);
	Athlete Ken = new Athlete (Last);

	//make sure the sum is correct
	@Test
	public void pointsEarnedShootingTest() {
		assertEquals(16, ShootRes1.pointsEarned(), .1);
	}

	//checking sum again to confirm method works correctly 
	@Test
	public void pointsEarnedShootingTest2() {
		assertEquals(8, ShootRes4.pointsEarned(), .1);
	}

	//makes sure the method produces true if the activating athlete is better on both skiing and shooting results
	@Test
	public void hasBeatenTest() {
		assertEquals(Joe.hasBeaten(Bob), true);
	}

	//makes sure the method produces true if the activating athlete is better at skiing but not shooting results
	@Test
	public void hasBeatenTest2() {
		assertEquals(Sam.hasBeaten(Ken), true);
	}

	//makes sure the method produces true if the activating athlete is better at shooting but not skiing results
	@Test
	public void hasBeatenTest3() {
		assertEquals(Ken.hasBeaten(Sam), true);
	}

	//makes sure the method produces false if the activating athlete is worse at shooting and skiing results
	@Test
	public void hasBeatenTest4() {
		assertEquals(Ken.hasBeaten(Joe), false);
	}

	//Tests to make sure the method produces the better skier if the better skier is the activating object
	@Test
	public void betterSkiierTest() {
		assertEquals(Joe.betterSkiier(Bob), Joe);
	}

	//Tests to make sure the method produces the better skier if the better skier is not the activating object
	@Test
	public void betterSkiierTest2() {
		assertEquals(Bob.betterSkiier(Joe), Joe);
	}

	//tests to make sure the calculations are done correctly 
	@Test
	public void getShootingPenaltiesTest() {
		assertEquals(First.getShootingPenalties(ShootRes1), 240, .1);
	}

	//second test to make sure method works correctly 
	@Test
	public void getShootingPenaltiesTest2() {
		assertEquals(Last.getShootingPenalties(ShootRes3), 660, .1);
	}

	//tests first place in skiing
	@Test
	public void pointsEarnedSkiingTest() {
		assertEquals(firstSki.pointsEarned(), 90, .1); 
	}

	//tests second place in skiing
	@Test
	public void pointsEarnedSkiingTest2() {
		assertEquals(secondSki.pointsEarned(), 140, .1); 
	}

	//tests third place in skiing
	@Test
	public void pointsEarnedSkiingTest3() {
		assertEquals(thirdSki.pointsEarned(), 205, .1); 
	}

	//tests anything thats not 1st, 2nd, and 3rd place in skiing
	@Test
	public void pointsEarnedSkiingTest4() {
		assertEquals(lastSki.pointsEarned(), 240, .1); 
	}

	//tests 1st place for final score
	@Test
	public void finalScoreTest() {
		assertEquals(First.finalScore(), 320, .1); 
	}

	//tests 2nd place for final score
	@Test
	public void finalScoreTest2() {
		assertEquals(Second.finalScore(), 780, .1); 
	}

	//tests 3rd place for final score
	@Test
	public void finalScoreTest3() {
		assertEquals(Third.finalScore(), 853, .1); 
	}

	//tests anything thats not 1st, 2nd, and 3rd place for final score
	@Test
	public void finalScoreTest4() {
		assertEquals(Last.finalScore(), 862, .1); 
	}
}
