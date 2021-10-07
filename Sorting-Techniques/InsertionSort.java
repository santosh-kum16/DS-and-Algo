class InsertionSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int pointingVal = arr[i];
			int comparingVal = i - 1;
			while (comparingVal >= 0 && arr[comparingVal] > pointingVal) {
				arr[comparingVal + 1] = arr[comparingVal];
				comparingVal = comparingVal - 1;
			}
			arr[comparingVal + 1] = pointingVal;
		}
	}
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		System.out.println("Before Sorting element in the Array are:");
		ob.printArray(arr);
		System.out.println("After Sorting element in the Array are:");
		ob.sort(arr);

		printArray(arr);
	}
}
