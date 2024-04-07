// https://www.hackerrank.com/challenges/chocolate-feast/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
        int candyAte = (int)N/C;
        int wrappersLeft = candyAte;
        int candyAteNow = 0;
        do{
            candyAteNow = (int)wrappersLeft/M;
            candyAte+=candyAteNow;
            wrappersLeft=candyAteNow+(wrappersLeft%M);
            
        }while(candyAteNow>0);
        return candyAte;
    }
}
