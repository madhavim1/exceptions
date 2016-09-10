/* Write a program containing a function which is expected 
 * to throw any kind of exception say NullPointerException 
 * or ArithmeticException etc and then handle this function 
 * in the parent function which calls this function.
 */
package com.training.exceptions;

public class HandleAnyException {
	public static float division(int num1, int num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Result: "+division(4, 0));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing files etc");
		}
	}
}
