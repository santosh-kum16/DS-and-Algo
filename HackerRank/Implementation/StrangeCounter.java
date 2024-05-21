//https://www.hackerrank.com/challenges/strange-code

import java.util.Scanner;

class StrangeCounter {
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
		long t = scan.nextLong();

		long result = solution(t);
		System.out.println(result);
	}
	public static long solution(long t){
		long n = 2;
		while (3 * (n - 1) < t)
			n = 2 * n;
		return ((3 * (n - 1) - t + 1));}
}



