// https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

import java.io.*;
import java.util.*;

public class TheLoveLetteryMistery {

    public static int minOperations(String word)
    {
        int count = 0;
        for(int i = 0;i<(int)word.length()/2;i++){
            count += Math.abs((word.charAt(i) - '0') - (word.charAt(word.length()-1-i) - '0'));
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       
        int numTestCases = Integer.parseInt(scan.nextLine());
        for(int i=0; i<numTestCases;i++){
            System.out.println(minOperations(scan.nextLine()));
        }
    }
}
