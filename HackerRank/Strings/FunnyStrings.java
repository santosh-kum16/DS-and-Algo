import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyStrings {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        boolean isFunny = true;
        for(int i = 0 ; i<testCases ; i++){
            String str = scan.nextLine();
            for(int j=0;j<str.length()-1;j++){
                int val1 = Math.abs(Character.getNumericValue(str.charAt(str.length()-2-j))-Character.getNumericValue(str.charAt(str.length()-1-j)));
                int val2 = Math.abs(Character.getNumericValue(str.charAt(j+1))-Character.getNumericValue(str.charAt(j)));
                if(val1!=val2){
                    isFunny = false;
                    break;
                }
            }
            System.out.println(isFunny?"Funny":"Not Funny");
            isFunny = true;    
        }
    }
}
