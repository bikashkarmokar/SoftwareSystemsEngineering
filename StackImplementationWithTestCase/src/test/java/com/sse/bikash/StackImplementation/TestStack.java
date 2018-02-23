package com.sse.bikash.StackImplementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestStack {
	
	Stack stack = new Stack(10);
	
	@Test
	public void testPush() {
		stack.push('a');
		assertEquals(1, stack.length);
	}
	
	@Test
	public void testPop() {
		stack.push('b');		
		assertEquals('b', stack.pop());		
	}
	
	@Test
	public void testTop() {
		stack.push('c');
		assertEquals('c', stack.top());
	}
	
	@Test
	public void testSize() {
		stack.push('d');
		stack.push('e');
		stack.push('f');
		
		assertEquals(3, stack.size());
		assertNotEquals("Not equals",4, stack.size());
	}
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, stack.isEmpty());
	}

}
