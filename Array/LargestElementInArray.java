public class LargestElementInArray {
	

	public static void main(String[] args) {
		int arr[] = { 20, 30, 12, 9, -3, 5 };
		largestElement(arr);
	}

	public static void largestElement(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("Maxmium element in array is " + max);
	}

}
