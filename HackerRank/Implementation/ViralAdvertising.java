import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args)
		{
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of days");
        int n = scan.nextInt();
        
        int people = 2;
        int adCount  = 2;
        for (int i = 2; i <= n; i++) {
            people = (people * 3) / 2;
            adCount += people;
        }
        System.out.println(count);
    }
}
