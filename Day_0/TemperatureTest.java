package day0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		Temperature temperature = new Temperature();
		
		Double Celcius = temperature.convertToCelsius(32.0);
		
		assertEquals(String.valueOf(Celcius),"0.0");
	}
	
	@Test
	void test2() {
		Temperature temperature = new Temperature();
		
		Double Farenheit = temperature.convertToFarenheit(10.0);
		
		assertEquals(String.valueOf(Farenheit),"50.0");
	}

}
