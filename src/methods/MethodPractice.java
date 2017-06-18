package methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {

	public static void main(String[] args) {

		System.out.println("Exercise: 01 " + getName("Shakil Khan"));

		System.out.println("Exercise: 02 " + getEvenNumberList(20));

		System.out.println("Exercise: 03 " + getOddNumberList(20));

		System.out.println("Exercise: 04 " + getKilometerFromMile(5) + " Kilometer");

		System.out.println("Exercise: 05 " + getStringInUpperCase("Something is better then nothing."));

		System.out.println("Exercise: 06 " + getLowerCase("SOMEtHING IS BettER THEN NOThING."));

		System.out.println("Exercise: 07 " + getIndexList("This is a String"));

		System.out.println("Exercise: 08 " + getCharList("Moniruzzaman"));

		System.out.println("Exercise: 09 " + getSum(5));

		System.out.println("Exercise: 10 " + getResult(5));

		System.out.println("Exercise: 11 " + Arrays.toString(getNumberArray(5)));

		System.out.println("Exercise: 12 " + getNumberList(15));

		System.out.println("Exercise: 13 " + getAresult(19));

		int[] numArray = { 5, 54, 17, 65, 30 };

		System.out.println("Exercise: 14 " + getMaxNum(numArray));

		System.out.println("Exercise: 15 " + getMinNum(numArray));

	}

	/**
	 * Exercise: 15
	 * 
	 * Write a method that take one number Array input and return the Min
	 * number.
	 * 
	 * Parameter: int[] numArray
	 * 
	 * Return type: int
	 * 
	 * Serving Bucket: Variable
	 */

	public static int getMinNum(int[] numArray) {

		int minNum = 0;

		Arrays.sort(numArray);

		minNum = numArray[0];

		return minNum;
	}

	/**
	 * Exercise: 14
	 * 
	 * Write a method that take one number Array input and return the Max
	 * number.
	 * 
	 * Parameter: int[] numArray
	 * 
	 * Return type: int
	 * 
	 * Serving Bucket: Variable
	 */

	public static int getMaxNum(int[] numArray) {

		int maxNum = 0;

		Arrays.sort(numArray);

		int lastIndex = numArray.length - 1;

		maxNum = numArray[lastIndex];

		return maxNum;
	}

	/**
	 * Exercise: 13
	 * 
	 * Write a method that take one number input and return fizz if the given
	 * number divided by 5 and return buzz if the given number divided by 5 &&
	 * 3. otherwise return fizz buzz.
	 * 
	 * Parameter: int number
	 * 
	 * Return type: String
	 * 
	 * Serving Bucket: Variable
	 */

	public static String getAresult(int number) {

		String result = null;

		if (number % 5 == 0 && number % 3 == 0) {
			result = "buzz";

		} else if (number % 5 == 0) {
			result = "fizz";

		} else {
			result = "fizz buzz";
		}

		return result;
	}

	/**
	 * Exercise: 12
	 * 
	 * Write a method that take one number input and return a numberList
	 * starting from 0 to that given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return Type: ArrayList<Integer>
	 * 
	 * Serving Bucket: List
	 */

	public static ArrayList<Integer> getNumberList(int number) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			numberList.add(i);
		}

		return numberList;
	}

	/**
	 * Exercise: 11
	 * 
	 * Write a method that take one number input and return an Array that
	 * contains 0 to that given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return Type: int[]
	 * 
	 * Serving Bucket: Array
	 */

	public static int[] getNumberArray(int number) {

		int[] numberArray = new int[number + 1];

		for (int i = 0; i <= number; i++) {

			numberArray[i] = i;
		}

		return numberArray;
	}

	/**
	 * Exercise: 10
	 * 
	 * Write a method that take one number input and return the square of that
	 * given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return type: int
	 * 
	 * Serving Bucket: Variable
	 */

	public static int getResult(int number) {

		int result = 0;

		for (int i = 1; i <= number; i++) {
			result = i * i;
		}
		return result;
	}

	/**
	 * Exercise: 09
	 * 
	 * Write a method that take one number input and return the sum of 1 to that
	 * given number.
	 * 
	 * Parameter: int number
	 * 
	 * Return type: int Serving
	 * 
	 * Bucket: Variable
	 */

	public static int getSum(int number) {

		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * Exercise: 08
	 * 
	 * Write a method that take one string input and return a List of all
	 * character.
	 * 
	 * Parameter: String text
	 * 
	 * Return type: ArrayList<Character>
	 * 
	 * Serving Bucket: List
	 */

	public static ArrayList<Character> getCharList(String text) {

		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i <= text.length() - 1; i++) {
			charList.add(text.charAt(i));
		}
		return charList;
	}

	/**
	 * Exercise: 07
	 * 
	 * Write a method that take one String input and return the list of all
	 * index.
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
	 * Exercise: 06
	 * 
	 * Write a method that take one string input and return same string in lower
	 * case.
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
	 * Parameter:
	 * 
	 * String text
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
	 * Exercise: 04
	 * 
	 * Write a method that take input as mile and return as kilometer.
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
	 * Exercise: 03
	 * 
	 * Write a method that take a number input and return the List of all odd
	 * number from 0 to that given number.
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
	 * Exercise: 02
	 * 
	 * Write a method that take a number input and return the List of all even
	 * number from 0 to that given number.
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
	 * Exercise: 01
	 * 
	 * Write a method that take your name input and return your name.
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
