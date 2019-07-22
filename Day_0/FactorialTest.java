package day0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial factorial = new Factorial();
		
		int result = factorial.calculateFactorial(5);
		assertEquals(String.valueOf(result),"120");
	}

}
