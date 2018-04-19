package online.judge.problem;

import java.util.Scanner;

public class problem_8393 {

	public static void main(String[] args) {

		int num;
		int totalNum = 0;

		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num >= 0 && num <= 10000) {

			for (int a = 1; a < num + 1; a++) {

				totalNum += a;
			}

			System.out.println(totalNum);
		}
	}
}
