package edu.psu.se411.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

public class StackTest {

	@Test
	public void testPushAndPop() {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
	assertEquals(3, stack.pop().intValue());
	assertEquals(2, stack.pop().intValue());
	assertEquals(1, stack.pop().intValue());

	}
	@Test
	
	public void pop_empty_stack() {
		Stack<String> stringStack = new Stack<>();
	    NoSuchElementException thrown =
	        assertThrows(NoSuchElementException.class,
	            () -> stringStack.pop(),
	            "Expected pop from empty Stack to throw, but it didn't"
	        );

	    assertTrue(thrown.getMessage().equals("Stack is empty,can’t pop"));
	}
		
		
	
}
