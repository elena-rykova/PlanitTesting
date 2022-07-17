import java.util.Scanner;

public class FibonacciNumbers {
	
	public static int findNumber(int n) {
		
		int numbers[] = new int[n+1];
		numbers[0] = 0;
		numbers[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
		}		
		return numbers[n];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the index number: ");
		int userNumber = sc.nextInt();
		
		System.out.println("The number in the fibonacci sequence with index " +
					userNumber + " is " + findNumber(userNumber));
	}
}
