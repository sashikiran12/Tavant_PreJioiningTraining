package day0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld Obj = new HelloWorld();
		String actual = Obj.getMessage();
		assertEquals(actual,"Hello World!");
	}

}
