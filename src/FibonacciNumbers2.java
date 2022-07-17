import java.util.Scanner;

public class FibonacciNumbers2 {
	
	public static void findNumber(int n) {
		
		int numbers[] = new int[n+5];
		numbers[0] = 0;
		numbers[1] = 1;
		
		for (int i = 2; i < n+5; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
//			System.out.println(numbers[i]);
		}		
		
		for (int j = 0; j < n+5; j++) {
//			System.out.println(numbers[j]);
			if (numbers[j] == n) {
				System.out.println("The number " + n + " is a fibonacci number "
						+ "with the index " + j);
			}
			else if (numbers[j] < n && numbers[j+1] > n) {
				if ((n - numbers[j]) < (numbers[j+1] - n)) {
					System.out.println("The number " + n + " is not a fibonacci number " 
						+ " and a closest fibonacci number is " + numbers[j]);
				}
				else {
					System.out.println("The number " + n + " is not a fibonacci number " 
						+ " and a closest fibonacci number is " + numbers[j+1]);
				}
			}
//			else {
//				System.out.println("hello");
//			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int userNumber = sc.nextInt();
		
		findNumber(userNumber);
	}

}
