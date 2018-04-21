package online.judge.problem;

import java.util.Scanner;

public class problem_11720 {

	public static void main(String[] args) {

		int num01;
		String num02;
		int numTot = 0;
		int numSub = 0;

		Scanner scanner = new Scanner(System.in);
		num01 = scanner.nextInt();
		num02 = scanner.next();

		if (num01 >= 1 && num01 <= 100) {

			if (num01 == num02.length()) {

				for (int a = 0; a < num01; a++) {

					numSub = Integer.parseInt(num02.substring(a, a + 1));
					numTot += numSub;
				}
				
				System.out.println(numTot);
			}
		}
	}
}
