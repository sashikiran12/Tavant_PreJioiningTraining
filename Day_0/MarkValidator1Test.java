package day0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day2.MarkValidator;

class MarkValidator1Test {

	@Test
	void test() {
		MarkValidator markValildator = new MarkValidator();
		boolean result = markValildator.isPass(45);
		assertEquals(String.valueOf(result),"true");
	}
	
	@Test
	void test2() {
		MarkValidator markValildator = new MarkValidator();
		String result = markValildator.markGrade(40);
		assertEquals(String.valueOf(result),"Grade D");
	}

}
