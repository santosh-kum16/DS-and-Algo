import java.util.Scanner;
public class BinarySearch {


 public int binarySearch(int[] sortedArray, int key) {
	int low = 0;//initial position of Array
	int high = sortedArray.length - 1;	//Final position of ARRAY
    int index = Integer.MAX_VALUE;	

    while (low <= high) {
	//Calculating the mid index 
    int mid = (low + high) / 2;
	//Comparing the mid-value to Key element
    if (sortedArray[mid] < key) {
    low = mid + 1;
    } 
	else if (sortedArray[mid] > key) {
    high = mid - 1;
    } 
	else if (sortedArray[mid] == key) {
    index = mid;
    break;
   }
  }
  return index;
 }

 
 public static void main(String[] args) {
	//Always pass sorted Array or Sort the Array and pass
	int[] sortedArray = { 10,30,40,60,70,85,90 };
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to search"); 
	int key = scan.nextInt();
     
	BinarySearch search = new BinarySearch();
	int index = search.binarySearch(sortedArray, key);//If index value Returned Max of Integer val
	if(index == Integer.MAX_VALUE)
		  System.out.println("Search element not Found");
	else	//If key exist in ARRAY than will execute this line
		  System.out.println("Search element found!!!: " + key+ " in location index : " + index);
	}
 }
