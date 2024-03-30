// https://www.hackerrank.com/challenges/pangrams

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        alphabet.remove(0);
        scananner scan = new scananner(System.in);
        String sentence = scan.nextLine().toLowerCase();
        
        for(int i=0;i<sentence.length();i++){
            if(!alphabet.isEmpty()){
                alphabet.remove(""+sentence.charAt(i));
            }else{
                break;
            }
        }
        System.out.println(alphabet.isEmpty()?"pangram":"not pangram");                                       
    }
}
