package com.flit.phonebook;

import static org.junit.Assert.*;

import com.flit.phonebook.solution.PhonebookImpl;
import org.junit.Test;

public class PhonebookTests {

	private String name1 = "James Rodríguez";
	private String number1 = "123-456-789";

	private String name2 = "Lionel Messi";
	private String number2 = "789-123-456";

	@Test
	public void test1() {
		Phonebook phonebook = new PhonebookImpl();

		// add number
		Boolean success = phonebook.addEntry(name1, number1);

		// get number
		String actualNumber = phonebook.getEntry(name1);

		assertEquals(true, success);
		assertEquals(number1, actualNumber);
	}

	@Test
	public void test2() {
		Phonebook phonebook = new PhonebookImpl();

		// add numbers
		Boolean success1 = phonebook.addEntry(name1, number1);
		Boolean success2 = phonebook.addEntry(name2, number2);

		// get second number
		String actualNumber = phonebook.getEntry(name2);

		assertEquals(true, success1);
		assertEquals(true, success2);
		assertEquals(number2, actualNumber);
	}

	@Test
	public void test3() {
		Phonebook phonebook = new PhonebookImpl();

		// add number
		Boolean success1 = phonebook.addEntry(name2, number2);

		// get number
		String actualNumber = phonebook.getEntry(name2);

		// update number
		String newNumber = "111-111-222";
		Boolean success2 = phonebook.updateEntry(name2, newNumber);

		// get updated number
		String updatedNumber = phonebook.getEntry(name2);

		assertEquals(true, success1);
		assertEquals(true, success2);
		assertEquals(number2, actualNumber);
		assertEquals(newNumber, updatedNumber);
	}

	@Test
	public void test4() {
		Phonebook phonebook = new PhonebookImpl();

		// add number
		Boolean success1 = phonebook.addEntry(name2, number2);

		// get number
		String actualNumber = phonebook.getEntry(name2);

		// remove number
		Boolean success2 = phonebook.deleteEntry(name2);

		// entry no longer exists
		String updatedNumber = phonebook.getEntry(name2);

		assertEquals(true, success1);
		assertEquals(true, success2);
		assertEquals(number2, actualNumber);
		assertEquals(null, updatedNumber);
	}

	// TODO: Implement more tests.


}
