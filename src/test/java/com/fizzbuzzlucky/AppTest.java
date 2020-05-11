package com.fizzbuzzlucky;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.fizzbuzzlucky.FizzBuzzLucky;

public class AppTest {
    @Test
    public void shouldCheckForDigit() {
		FizzBuzzLucky fizzBuzzOne = new FizzBuzzLucky();

        assertEquals(fizzBuzzOne.containsLuckyDigit(3, 9231), true);
		assertEquals(fizzBuzzOne.containsLuckyDigit(0, 1092), true);
		assertEquals(fizzBuzzOne.containsLuckyDigit(4, 867), false);
    }

	public void shouldCountFrequencies() {
		FizzBuzzLucky fizzBuzzTwo = new FizzBuzzLucky();
		int[] answerOne = {4,3,1,2,10};
		int[] answerTwo = {4,2,1,7,7};
		int[] inQuestionOne = fizzBuzzTwo.printFizzBuzz(1, 20);
		int[] inQuestionTwo = fizzBuzzTwo.printFizzBuzz(15, 35);

        assertArrayEquals(inQuestionOne, answerOne);
		assertArrayEquals(inQuestionTwo, answerTwo);
    }
}
