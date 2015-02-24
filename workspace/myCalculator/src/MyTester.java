import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void testNfactorial1() {
		MyCalculator calc = new MyCalculator();
		
		int actual = calc.nfactorial(4);
		assertEquals("4!=24", 24, actual, 0.0);
	}
	
	@Test
	public void testNfactorial2() {
		MyCalculator calc = new MyCalculator();
		
		int actual = calc.nfactorial(1);
		assertEquals("1!=1", 1, actual, 0.0);
	}
	
	@Test
	public void testNfactorial3() {
		MyCalculator calc = new MyCalculator();
		
		int actual = calc.nfactorial(0);
		assertEquals("0!=1", 1, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch1() {
		MyCalculator calc = new MyCalculator();
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int actual = calc.binarySearch(a, 1);
		assertEquals(0, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch2() {
		MyCalculator calc = new MyCalculator();
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int actual = calc.binarySearch(a, 9);
		assertEquals(8, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch3() {
		MyCalculator calc = new MyCalculator();
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int actual = calc.binarySearch(a, 5);
		assertEquals(4, actual, 0.0);
	}
	
	@Test
	public void testBinarySearch4() {
		MyCalculator calc = new MyCalculator();
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int actual = calc.binarySearch(a, 0);
		assertEquals(-1, actual, 0.0);
	}

}
