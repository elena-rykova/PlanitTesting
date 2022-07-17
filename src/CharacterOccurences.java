import java.util.Scanner;

public class CharacterOccurences {
	
	public static char findCharacter(String str) {
		
		char character = ' ';
		int number[] = new int[str.length()];
		
		// count character occurrences
		for (int i = 0; i < str.length(); i++) {
			character = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (character == str.charAt(j)) {
					count++;
				}
			}
			number[i] = count;
//			System.out.println(number[i]);
		}
		
		// find max number of occurrences
		int max = -1;
		int index = 0;
		for (int a = 0; a < str.length(); a++) {
			if (number[a] > max) {
				max = number[a];
				index = a;
			}
		}
		character = str.charAt(index);
		return character;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your string: ");
		String userString = sc.nextLine();
		
		System.out.println(findCharacter(userString));
	}
}
