package com.iss;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingsImplTest {
	
	private Greetings greeting;

	@Before
	public void setup() {
		System.out.println("setup");
		greeting = new GreetingsImpl();
	}

	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		String result = greeting.greet("JUnit");
		assertNotNull(result);
		assertEquals("HelloJUnit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldReturnAnExceptionWhen_NameIsNull() {
		System.out.println("greetShouldReturnAnExceptionWhen_NameIsNull");
		greeting.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldReturnAnExceptionWhen_NameIsBlank() {
		System.out.println("greetShouldReturnAnExceptionWhen_NameIsBlank");
		greeting.greet("");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
		greeting = null;
	}
}
