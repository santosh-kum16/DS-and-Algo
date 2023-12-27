public class CopyAllElementsToAnotherArray {
	

	public static void main(String[] args) {

		//Values Assign to ARRAY (arr1)
		int arr1[] = { 2,4,5,8,90,20,3,5 };

		//Creating a new ARRAY (arr2)equal to SIZE of arr1
		int arr2[] = new int[arr1.length];

		//Copying all the vlues from arr1 to arr2 and printing as well
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

	}

}
