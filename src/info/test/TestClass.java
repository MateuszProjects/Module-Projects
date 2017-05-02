package info.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestClass {

	@Test
	public void test() {
		TestOne t = new TestOne();
		int dane = t.licz(5);
		assertEquals(26, dane);
		
		
		
	}
	
	
	
	
	
	

}
