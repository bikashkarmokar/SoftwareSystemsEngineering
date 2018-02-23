package com.sse.bikash.StackImplementation;

import java.util.NoSuchElementException;

public class Stack {

	public char stack[];
	public int top, size, length;

	public Stack(int stackSize) {
		this.size = stackSize;
		this.length = 0;
		this.top = -1;

		this.stack = new char[size];
	}

	public void push(char i) {
		if (top + 1 > size) {
			System.out.println("Overflow");
			throw new NoSuchElementException("Overflow");
		} else {
			stack[++top] = i;
			length++;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Underflow");
			throw new NoSuchElementException("Underflow");
		} else {
			length--;
			return stack[top--];
		}
	}

	public char top() {
		if (isEmpty()) {
			System.out.println("Underflow");
			throw new NoSuchElementException("Underflow");
		} else {
			return stack[top];
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return length;
	}

}
