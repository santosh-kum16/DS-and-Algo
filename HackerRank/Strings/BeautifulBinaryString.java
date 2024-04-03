// https://www.hackerrank.com/challenges/beautiful-binary-string/problem

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulBinaryString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		final int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		final String stringToBeFound = "010";
		int lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = str.indexOf(stringToBeFound, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += stringToBeFound.length();
			}
		}
		System.out.println(count);
	}
}
