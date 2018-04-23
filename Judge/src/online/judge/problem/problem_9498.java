package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_9498 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		String grade = "";
		int score = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			score = Integer.parseInt(br.readLine());

			if (score >= 0 && score <= 100) {

				if (score >= 0 && score < 60) {
					grade = "F";
				} else if (score >= 60 && score < 70) {
					grade = "D";
				} else if (score >= 70 && score < 80) {
					grade = "C";
				} else if (score >= 80 && score < 90) {
					grade = "B";
				} else if (score >= 90 && score <= 100) {
					grade = "A";
				}
				
				bw.write( grade + "\n");
				bw.flush();
			}

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
