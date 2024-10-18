import java.util.Scanner;

public class Sum {
	public static void main (String[] args) {

		System.out.println("Enter three Numbers");
		int max = 0;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		max = Math.max(num1, Math.max(num2, num3));
		min = Math.min(num1, Math.min(num2, num3));

		int sum = max + min;

		System.out.println("Mininum of three" + min);
		System.out.println("Maximum of three" + max);
		System.out.println("Sum of Minimum and Maximum" + sum);

		sc.close();
	}
}
