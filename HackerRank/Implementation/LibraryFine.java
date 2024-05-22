import java.io.*;
import java.util.*;

public class LibraryFine 
{

    public static void main(String[] args)
    {

        int fine = 0;
        Scanner scan = new Scanner(System.in);
        String[] returnedDay = scan.nextLine().split(" ");
        String[] returnDay = scan.nextLine().split(" ");
        if(Integer.parseInt(returnDay[2])<Integer.parseInt(returnedDay[2]))
		    {
            fine = 10000;
        }
		    else if(Integer.parseInt(returnDay[2])==Integer.parseInt(returnedDay[2]))
		    {
                if(Integer.parseInt(returnDay[1])<Integer.parseInt(returnedDay[1]))
					      {
						        fine = (Integer.parseInt(returnedDay[1])-Integer.parseInt(returnDay[1]))*500;
				        }
				        else if(Integer.parseInt(returnDay[1])==Integer.parseInt(returnedDay[1])&&(Integer.parseInt(returnDay[0])<Integer.parseInt(returnedDay[0])))
				        {
                    fine = (Integer.parseInt(returnedDay[0])-Integer.parseInt(returnDay[0]))*15;
                }
        } 
        System.out.println(fine);
    }
}
