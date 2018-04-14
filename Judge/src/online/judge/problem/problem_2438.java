package online.judge.problem;

import java.util.Scanner;

public class problem_2438 {

	public static void main(String[] args) {

		int num;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num >=1 && num <= 100) {
			
			for (int a = 1; a < num + 1; a++) {

				for (int b = 1; b < a + 1; b++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
	}
}
