package online.judge.problem;

import java.util.Scanner;

public class problem_1942 {

	public static void main(String[] args) {

		int month, day;

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] weeks = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int dayTotal = 0;
		String week = "";

		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		day = scanner.nextInt();

		if (month >= 1 && month <= 12) {

			if (day >= 1 && day <= 31) {

				if (days[month - 1] >= day) {

					if (month != 1) {

						for (int a = 0; a < month - 1; a++) {

							dayTotal += days[a];
						}
					}

					dayTotal += day;

					week = weeks[(dayTotal % 7)];

					System.out.println(week);

				}
			}
		}
	}
}
