//https://www.hackerrank.com/challenges/camelcase

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		String str = scan.nextLine();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				count++;
			}
		}
		// First word's letter will not be in upper case. So, we have to add +1 in final answer
		System.out.println(count + 1);
	}
}
