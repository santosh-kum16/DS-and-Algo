/* Lonely Integer
There are N integers in an array A. All but one integer occurs in pairs. Your task is to find the number that occurs only once.

Input Format

The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints

1≤N<100 
N % 2=1 (N is an odd number) 
0≤A[i]≤100,∀i∈[1,N]
Output Format

Output S, the number that occurs only once.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        ArrayList<String> allStr = new ArrayList<String>(Arrays.asList(scan.nextLine().split(" ")));
        String answer="";
        int pos = 0;
        while(allStr.size()>1){     
            answer = allStr.get(0);
            allStr.remove(0);
            if(!allStr.contains(answer)){
                break;
            }else{
                allStr.remove(answer);
            }
            pos++;
            
        }
        System.out.println(alStr.size()!=1?answer:allStr.get(0));
    }
}
