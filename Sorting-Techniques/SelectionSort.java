class SelectionSort
{
    void sort(int arr[])
    {
        int len = arr.length;
        for (int i = 0; i < len-1; i++)
        {
            int min = i;
            for (int j = i+1; j < len; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[])
    {
        int len = arr.length;
        for (int i=0; i<len; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        SelectionSort obj = new SelectionSort();
        int arr[] = {3,6,1,0,9,6,7,8};
		System.out.println("Before sorted: ");
		obj.printArray(arr);
        obj.sort(arr);
        System.out.println("Sorted array: ");
        obj.printArray(arr);
    }
}
