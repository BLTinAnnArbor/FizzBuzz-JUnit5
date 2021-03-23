import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test  
	public void testCheckNum() {
	
	
	assertEquals(FizzBuzz.checkNum(0), "0");
	assertEquals(FizzBuzz.checkNum(1), "1");
	assertEquals(FizzBuzz.checkNum(3), "Fizz");
	assertEquals(FizzBuzz.checkNum(4), "4");
	assertEquals(FizzBuzz.checkNum(5), "Buzz");
	assertEquals(FizzBuzz.checkNum(10), "Buzz");
	assertEquals(FizzBuzz.checkNum(15), "FizzBuzz");
	assertEquals(FizzBuzz.checkNum(16), "16");
	assertEquals(FizzBuzz.checkNum(30), "FizzBuzz");
	assertEquals(FizzBuzz.checkNum(60), "FizzBuzz");
	assertEquals(FizzBuzz.checkNum(99), "Fizz");
	assertEquals(FizzBuzz.checkNum(100), "Buzz");
	
	//assertEquals(FizzBuzz.checkNum(20), "20");    //fails
	//assertEquals(FizzBuzz.checkNum(13), "Buzz");  // fails:
	
	}
	
} // class 
