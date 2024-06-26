// https://www.hackerrank.com/challenges/angry-professor/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases=Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numCases;i++){
            int numStudents = sc.nextInt();
            int atLeastNumStudents = sc.nextInt();
            sc.nextLine();
            boolean isClass = true;
            int studentsAttending = 0;
            for(int j = 0;j<numStudents;j++){
                int timeArrival = sc.nextInt();
                if(timeArrival<=0){
                    studentsAttending++;
                }
            }
            System.out.println(studentsAttending>=atLeastNumStudents?"NO":"YES");
        }
    }
}
