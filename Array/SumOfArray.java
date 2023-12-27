public class SumOfArray {

	public static void main(String[] args) {
		int a[] = { 1,2,2,3,6,9,7,8 };
		sumOfElement(a);
	}

	public static void sumOfElement(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > sum) {
				sum += a[i];
			}

		}
		System.out.println("Sum Of elements are  " + sum);
	}

}
