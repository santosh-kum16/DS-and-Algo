import java.util.Scanner;
public class LinearSearchExample{
	
	public static int linearSearch(int[] arr, int key){    
        //Loop start comparion from Array Elements to key value one by one
		for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;  //If key element exixst in the Array  
            }    
        }    
        return -1; // If key not found in the Array   
    }    
    public static void main(String args[]){    
        int[] array= {20,30,10,50,70,90};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the key element to serch");
        int key = scan.nextInt();

		//Passing the array and key value
		int resultindex = linearSearch(array, key);
		if(resultindex== -1)
			System.out.println("Key element not found in the Array.");
		else
			System.out.println(key+" is found at index: "+resultindex);
    }    
}    
