package methods;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Exercise: 01 " + getName("Shakil Khan"));

		System.out.println("Exercise: 02 " + getEvenNumberList(20));

		System.out.println("Exercise: 03 " + getOddNumberList(20));

	}

	/**
	 * Exercise: 03 Write a method that take a number input and return the List
	 * of all odd number from 0 to that given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return type: ArrayList<Integer>
	 * 
	 * Serving Bucket: List
	 */

	public static ArrayList<Integer> getOddNumberList(int number) {

		ArrayList<Integer> OddNumberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				OddNumberList.add(i);

			}
		}

		return OddNumberList;
	}

	/**
	 * Exercise: 02 Write a method that take a number input and return the List
	 * of all even number from 0 to that given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return type: ArrayList<Integer>
	 * 
	 * Serving Bucket: List
	 */

	public static ArrayList<Integer> getEvenNumberList(int number) {

		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {

				evenNumberList.add(i);

			}
		}

		return evenNumberList;
	}

	/**
	 * Exercise: 01 Write a method that take your name input and return your
	 * name.
	 * 
	 * Parameter: String text
	 * 
	 * Return type: String
	 * 
	 * Serving Bucket: Variable
	 */

	public static String getName(String text) {

		String name = null;

		name = text;

		return name;
	}

}
