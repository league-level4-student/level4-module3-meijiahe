package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() { 
		//Using one try for each test to ensure every test would be able to run through//
		//print Stack Trace is to show our test are running normal or not//
	
		try {
	//	ExceptionMethods.divide(4.4,1.1); this line only check whether our method run or not//
	//the assertEqual can check whether the returned value is the one that we are expecting for, gettting useful detail info//
			assertEquals(4,ExceptionMethods.divide(4.4,1.1));
		} catch (IllegalArgumentException x){
			x.printStackTrace();
		}
		try {
			assertEquals(0,ExceptionMethods.divide(6.1,0.0));
		} catch (IllegalArgumentException x){
			x.printStackTrace();
		}
		try {
			assertEquals(3,ExceptionMethods.divide(6.3,2.1));
		} catch (IllegalArgumentException x){
			x.printStackTrace();
		}
		
	}
	 
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		try {
			assertEquals("tac",ExceptionMethods.reverseString("cat"));
		} catch (IllegalStateException y){
			y.printStackTrace();
		}
		try {
			assertEquals("",ExceptionMethods.reverseString(""));
			//Reason that this line will fail and we could still run successfully is we got our exception//
		} catch (IllegalStateException y){
			y.printStackTrace();
		}
		try {
			assertEquals("otatop",ExceptionMethods.reverseString("potato"));
		} catch (IllegalStateException y){
			y.printStackTrace();
		}
		
	}
	
	
	

}
