package online.judge.problem;

import java.util.Scanner;

public class problem_2439 {

	public static void main(String args[]) {

		int num;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num >= 1 && num <= 100) {

			for (int a = 0; a < num; a++) {

				for (int b = 0; b < num; b++) {

					if (num > a + b + 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

				System.out.println();
			}
		}

	}
}
