package methods;

import java.util.ArrayList;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Exercise: 01 " + getName("Shakil Khan"));

		System.out.println("Exercise: 02 " + getEvenNumberList(20));

		System.out.println("Exercise: 03 " + getOddNumberList(20));

		System.out.println("Exercise: 04 " + getKilometerFromMile(5) + " Kilometer");

		System.out.println("Exercise: 05 " + getStringInUpperCase("Something is better then nothing."));

		System.out.println("Exercise: 06 " + getLowerCase("SOMEtHING IS BettER THEN NOThING."));

		System.out.println("Exercise: 07 " + getIndexList("This is a String"));

	}

	/**
	 * Exercise: 07 Write a method that take one String input and return the
	 * list of all index.
	 * 
	 * Parameter: String text
	 * 
	 * Return type: ArrayList<integer>
	 * 
	 * Serving Bucket/Container: List
	 */

	public static ArrayList<Integer> getIndexList(String text) {

		ArrayList<Integer> indexList = new ArrayList<Integer>();

		for (int i = 0; i <= text.length(); i++) {

			indexList.add(i);
		}
		return indexList;
	}

	/**
	 * Exercise: 06 Write a method that take one string input and return same
	 * string in lower case.
	 * 
	 * Parameter: String text
	 * 
	 * Return type: String
	 * 
	 * Serving Bucket: Variable
	 */

	public static String getLowerCase(String text) {

		String lowerCase = null;

		lowerCase = text.toLowerCase();

		return lowerCase;
	}

	/**
	 * Exercise: 05 Write a method that take one string input and return same
	 * string in upper case.
	 * 
	 * Parameter: String text
	 * 
	 * Return type: String
	 * 
	 * Serving Bucket: Variable
	 */

	public static String getStringInUpperCase(String text) {

		String upperCase = null;

		upperCase = text.toUpperCase();

		return upperCase;
	}

	/**
	 * Exercise: 04 Write a method that take input as mile and return as
	 * kilometer.
	 * 
	 * Parameter: double mile
	 * 
	 * Return type: double
	 * 
	 * Serving Bucket: Variable
	 */

	public static double getKilometerFromMile(double mile) {

		double kilometer = 0;

		kilometer = mile * 1.61;

		return kilometer;
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
