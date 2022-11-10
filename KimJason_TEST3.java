/*
 * @author: Jason Kim
 * May 17 2022
 * Unit 3 Test
 * Ver 1.0
 */

import java.util.Scanner;

public class KimJason_TEST3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // declaring scanner object
		System.out.println("Please input the length of array.");
		String input = scan.nextLine();
		String[] data = new String[Integer.parseInt(input)];
		System.out.println("Array length will be " + input + "\n");

		for (int i = 0; i < data.length; i++) {
			System.out.println("Please enter the name for index " + i);
			input = scan.nextLine();
			data[i] = input;
		}

		getResults(data);
	}

	public static String getShortestName(String[] data) { // gets shortest name from array, string array parameter, returns shortest string
		String shortest = data[0];
		for (int i = 0; i < data.length; i++) {
			if (shortest.length() > data[i].length()) {
				shortest = data[i];
			}
		}
		return shortest;
	}

	public static String getLongestName(String[] data) { // gets longest name from array, string array parameter, returns longest string
		String longest = data[0];
		for (int i = 0; i < data.length; i++) {
			if (longest.length() < data[i].length()) {
				longest = data[i];
			}
		}
		return longest;
	}

	public static void getResults(String[] data) { // prints out results, string array parameter, no return value
		if (getShortestName(data).compareTo(getLongestName(data)) < 0) {
			System.out.println("The results of your entries are: ");
			System.out.println("Shortest name: " + getShortestName(data) + "\nLongest Name: " + getLongestName(data));
		} else if (getShortestName(data).compareTo(getLongestName(data)) > 0) {
			System.out.println("The results of your entries are: ");
			System.out.println("Longest name:" + getLongestName(data) + "\nShortest Name: " + getShortestName(data));
		} else if (getShortestName(data).compareTo(getLongestName(data)) == 0) {
			System.out.println("The results of your entries are:");
			System.out.println("Shortest name: " + getShortestName(data) + "\nLongest Name: " + getLongestName(data));
		}
	}

}
