package day0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void test() {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		
		int even = sumOfNumbers.sumOfEvenNumbers(1, 10);
		assertEquals(String.valueOf(even),"30");
		
		int odd = sumOfNumbers.sumOfOddNumbers(1, 10);
		assertEquals(String.valueOf(odd),"25");
	}

}
