/* Write a program that is expected to throw a null 
 * pointer exception and in turn handles it using try 
 * catch and finally.
 */
package com.training.exceptions;

public class HandleNullPointer {
	
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println("String length: "+s.length());
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		} finally {
			System.out.println("Catching NullPointerException ...");
		}
	}
}
