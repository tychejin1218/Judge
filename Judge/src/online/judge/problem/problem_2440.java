package online.judge.problem;

import java.util.Scanner;

public class problem_2440 {

	public static void main(String args[]) {

		int num;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num >= 1 && num <= 100) {

			for (int a = 0; a < num; a++) {

				for (int b = 0; b < num - a; b++) {

					if (num == a + b + 1) {

						System.out.println("*");

					} else {

						System.out.print("*");
					}
				}
			}
		}
	}
}
