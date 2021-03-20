import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	void loopThruOneHundred() {
		
		for(int i=1; i<101; i++) {
			Integer num = i;
			String expected = num.toString();
			
			if(i%3==0 && i%5==0) {
				expected = "FizzBuzz";
			}
			else if(i%3==0) {
				expected = "Fizz";
			}
			else if(i%5==0) {
				expected = "Buzz";
			}
			
			String actual = FizzBuzz.answer(i);
			assertEquals(expected, actual);
			
			System.out.print(actual +" ");
			
				
		}
		
	}

}
