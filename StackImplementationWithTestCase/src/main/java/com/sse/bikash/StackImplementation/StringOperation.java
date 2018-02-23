package com.sse.bikash.StackImplementation;

public class StringOperation {

	public String reverseString(String str) {
		int len = str.length();
		Stack stack = new Stack(len);

		for (int i = 0; i < len; i++) {
			stack.push(str.charAt(i));
		}

		String reverseStr = "";

		while (!stack.isEmpty()) {
			reverseStr = reverseStr + stack.pop();
		}

		return reverseStr;
	}

	public boolean isPalindrome(String str) {
		String rev = reverseString(str);
		if (rev.equals(str))
			return true;
		else
			return false;
	}

}
