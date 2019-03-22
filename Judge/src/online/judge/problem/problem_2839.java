package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_2839 {

	public static void main(String args[]) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int weightSugar = 0;
			int bag = 0;

			weightSugar = Integer.parseInt(br.readLine());

			if (weightSugar >= 3 && weightSugar <= 5000) {

				int num05 = 0;
				int num03 = 0;
				int num = 0;

				Loop1: for (int a = 0; a <= 1000; a++) {

					num05 = 5 * a;

					Loop2: for (int b = 0; b <= 1666; b++) {

						num03 = 3 * b;

						if ((num03 != 0) && (num03 % 5 == 0)) {

							break Loop2;

						} else {

							num = num05 + num03;

							if (num == weightSugar) {

								bag = a + b;
								break Loop1;

							} else {

								bag = -1;
							}
						}
					}
				}
			}

			bw.write(bag + "\n");
			bw.flush();

		} catch (Exception e) {
			e.getMessage();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
		}
	}
}
