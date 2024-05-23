//https://www.hackerrank.com/challenges/cut-the-sticks/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> sticks = new ArrayList<Integer>();
        int numSticks = Integer.parseInt(scan.nextLine());
        for(int i = 0 ; i < numSticks ; i++){
            sticks.add(new Integer(scan.nextInt()));
        }
        while(sticks.size()>0){
            Collections.sort(sticks);
            int shortestStick = sticks.get(0);
            
            int pos = 0;
            System.out.println(sticks.size());
            while(pos<sticks.size()){
                int num = sticks.get(pos);
                num-=shortestStick;
                if(num>0){
                    sticks.set(pos,num);
                    pos++;
                }else{
                    sticks.remove(pos);
                
                }
            
            }  
        }
    }
}
