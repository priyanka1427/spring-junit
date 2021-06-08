package com.iss;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingsImplTest {

	@Test
	public void greetShouldReturnAValidOutput() {
		Greetings greeting = new GreetingsImpl();
		String result = greeting.greet("JUnit");
		assertNotNull(result);
		assertEquals("HelloJUnit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldReturnAnExceptionWhen_NameIsNull() {
		Greetings greeting = new GreetingsImpl();
		greeting.greet("fail test");
	}

}
