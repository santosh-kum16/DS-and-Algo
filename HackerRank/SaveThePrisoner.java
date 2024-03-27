//https://www.hackerrank.com/challenges/save-the-prisoner

import java.io.*;
import java.util.*;

public class SaveThePrisoner {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        for(int i = 0; i < numTestCases; i++){
            int numPrisoners = scan.nextInt();
            int numCandies = scan.nextInt();
            int startID = scan.nextInt();
            
            if ((startID + numCandies) > numPrisoners) {
                int leftCandies = (startID + numCandies) - numPrisoners - 1;
                System.out.println(leftCandies <= 1 || (leftCandies % numPrisoners) == 0?numPrisoners : (leftCandies % numPrisoners));
            } else {
                System.out.println("" + ((startID + numCandies) - 1) );
            }
        }
        
    }
}
