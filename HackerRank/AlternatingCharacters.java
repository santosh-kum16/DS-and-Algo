// https://www.hackerrank.com/challenges/alternating-characters/problem

import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static int consecutiveChars(String str)
    {
        StringBuilder mutableStr = new StringBuilder(str);
        int numDeletions = 0;
        int pos = 0;
        while(pos<mutableStr.length()-1){
            if(mutableStr.charAt(pos) == mutableStr.charAt(pos+1)){
                mutableStr.deleteCharAt(pos);
                numDeletions++;
            }else{
                pos++;
            }
        }
        
        
        return numDeletions;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numCases = Integer.parseInt(scan.nextLine());
        for(int i=0; i<numCases; i++){
            System.out.println(consecutiveChars(scan.nextLine()));
        }
    }
}
