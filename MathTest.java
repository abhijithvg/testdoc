package com.tddJunit.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathsTest {
	
	private Maths classundertest;

	@BeforeEach
	void setUp() throws Exception {
		classundertest = new Maths();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//comment-3 : fail("Not yet implemented");

		/* comment-4:	long result = 10+2;
assertEquals(result, classundertest.add(10,2)); */

	}

	@Test
	public void testSubtract() {
	//comment-5: fail("Not yet implemented");
	/* comment-6: long result = 10-2;
		assertEquals(result, classundertest.subtract(10,2));*/	

	}

}
