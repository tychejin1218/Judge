package online.judge.problem;

import java.util.Scanner;

public class problem_11721 {

	public static void main(String[] args) {

		String str;
		int strLen = 0;

		Scanner scanner = new Scanner(System.in);
		str = scanner.next();
		strLen = str.length();

		if (strLen <= 100) {
			
			for (int a = 0; a < strLen; a = a + 10) {

				if (strLen < a + 10) {
					System.out.println(str.substring(a, strLen));
				} else {
					System.out.println(str.substring(a, a + 10));
				}
			}
		}
	}
}
