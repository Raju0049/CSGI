package com.java.csg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The {@code AppTest} class contains unit tests for the methods in the {@code App} class.
 * These tests check if the methods correctly handle different edge cases and inputs.
 * <p>
 * Example test case:
 * <pre>
 *   testIsWordHavingLengthMoreThanFive()
 * </pre>
 * </p>
 * 
 * @version 1.0
 * @since 2025-02-19
 */
public class AppTest 
{
	/**
	 * This test checks whether the word length is correctly evaluated against 5
	 * characters.
	 */
	@Test
	public void testIsWordHavingLengthMoreThanFive() {
		assertTrue(App.isWordHavingLengthMoreThanLength("gameplay"));
		assertFalse(App.isWordHavingLengthMoreThanLength(""));
		assertTrue(App.isWordHavingLengthMoreThanLength("cricket"));
		assertFalse(App.isWordHavingLengthMoreThanLength("Music"));
	}

	/**
	 * This test checks whether the word starts with the letter 'M' or 'm'.
	 */
	@Test
	public void testIsWordStartWithRequiredLetter() {
		assertTrue(App.isWordStartWithRequiredLetter("Music"));
		assertFalse(App.isWordStartWithRequiredLetter("Germany"));
		assertTrue(App.isWordStartWithRequiredLetter("mangos"));
	}
}