package com.sse.bikash.StackImplementation;

/**
 * Bikash Chandra Karmokar
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "String Operation:\n" );     
        
        StringOperation strOp = new StringOperation();
        String reverseStr = strOp.reverseString("bikash");
        System.out.println(reverseStr);
        
        boolean result = strOp.isPalindrome("nayan");
        System.out.println(result);
        
        
    }
}
