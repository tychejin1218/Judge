package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_1110 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		String firstNumber = "";
		String newNumber = "";

		int tempNumber00 = 0;
		int tempNumber01 = 0;
		int tempNumber02 = 0;

		int cycle = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			firstNumber = br.readLine();

			if (Integer.parseInt(firstNumber) >= 0 && Integer.parseInt(firstNumber) <= 100) {

				firstNumber = String.format("%02d", Integer.parseInt(firstNumber));

				while (!newNumber.equals(firstNumber)) {

					if (newNumber.length() != 2) {
						tempNumber01 = Integer.parseInt(firstNumber.substring(0, 1));
						tempNumber02 = Integer.parseInt(firstNumber.substring(1, 2));
					} else {
						tempNumber01 = Integer.parseInt(newNumber.substring(0, 1));
						tempNumber02 = Integer.parseInt(newNumber.substring(1, 2));
					}

					tempNumber00 = tempNumber01 + tempNumber02;

					if (tempNumber00 >= 10) {
						newNumber = tempNumber02 + "" + String.valueOf(tempNumber00).substring(1, 2);
					} else {
						newNumber = tempNumber02 + "" + String.valueOf(tempNumber00);
					}

					cycle++;
				}
			}

			bw.write(cycle + "\n");
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
