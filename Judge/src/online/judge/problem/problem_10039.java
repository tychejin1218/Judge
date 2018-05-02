package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_10039 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		int[] numArrays = new int[5];
		int total = 0;
		int average = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			for (int a = 0; a < numArrays.length; a++) {

				int score = Integer.parseInt(br.readLine());

				if ((score >= 0 && score <= 100) && (score % 5 == 0)) {
					numArrays[a] = score;
				} else {
					throw new Exception("0점 이상, 100점 이하인 5의 배수가 아닌 수를 입력!");
				}
			}

			for (int a = 0; a < numArrays.length; a++) {

				if (numArrays[a] < 40) {
					total += 40;
				} else {
					total += numArrays[a];
				}
			}

			average = total / 5;

			bw.write(average + "\n");
			bw.flush();

		} catch (Exception e) {

			try {
				bw.write(e.getMessage() + "\n");
				bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

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
