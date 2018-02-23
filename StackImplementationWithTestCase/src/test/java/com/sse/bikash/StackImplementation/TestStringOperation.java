package com.sse.bikash.StackImplementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStringOperation {
	
	StringOperation strOp = new StringOperation();	
	
	@Test
	public void testReverseString() {
		String reverseStr = strOp.reverseString("bikash");        
        assertEquals("hsakib", reverseStr);
        assertNotEquals("bikash", reverseStr);
	}
	
	@Test
	public void testIsPalindrome() {
		assertTrue(strOp.isPalindrome("nayan"));
		assertFalse(strOp.isPalindrome("bikash"));
	}

}
