import java.util.Scanner;
public class Solution {
    public static void main(String args []){


    Scanner scan=new Scanner(System.in);
    int a[]=new int[3];
    int b[]=new int[3];
    for(int i=0;i<a.length;i++){
        a[i]=scan.nextInt();
    }
    for(int j=0;j<b.length;j++){
        b[j]=scan.nextInt();
    }
    int bob=0;
    int alice=0;
    for(int k=0;k<a.length;k++){
        if(a[k]<b[k]){
            bob++;
        }
        else if(a[k]==b[k]){
            
        }
        else{
            alice++;
        }
    }
    System.out.print(alice+" "+bob);

    }

    }

    
