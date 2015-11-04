package inputhelper;

import java.util.Scanner;

public class InputHelper {

	public int inputNumber(String label) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int result;
		while (true) {
			System.out.print(label);
			String userInput = sc.nextLine();
			try {
				result = Integer.parseInt(userInput);
				break;
			} catch (NumberFormatException ex) {
				System.out.println("Please input integer number. Try again...");
			}
		}
		return result;
	}

	public int inputNumber(String label, int minValue, int maxValue) {
		while (true) {
			int res = inputNumber(label);
			if (res >= minValue && res <= maxValue) {
				return res;
			}
			System.out.println("Number should be in range " + minValue + " - " + maxValue + ". Try again...");
		}
	}

	public String readString(String label) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(label);
			String str = sc.nextLine();
			if (str == null || str.length() == 0) {
				System.out.println("Empty string!");
			} else {
				return str;
			}
		}
	}
}
