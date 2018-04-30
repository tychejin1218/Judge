package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_1065 {

	public static void main(String[] args) {
	
		int N = 1;

		String ariSeq = "";
		int ariSeqLen = 0;
		int ariSeqCnt = 0;

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			N = Integer.parseInt(br.readLine());

			if (N >= 100 && N <= 1000) {

				ariSeqCnt = 99;

				for (int a = 1; a <= N; a++) {

					ariSeq = String.valueOf(a);
					ariSeqLen = ariSeq.length();

					if (ariSeqLen == 3) {

						int airNumArr[] = new int[3];
						airNumArr[0] = Integer.parseInt(ariSeq.substring(0, 1));
						airNumArr[1] = Integer.parseInt(ariSeq.substring(1, 2));
						airNumArr[2] = Integer.parseInt(ariSeq.substring(2, 3));

						int difArr[] = new int[2];
						difArr[0] = airNumArr[0] - airNumArr[1];
						difArr[1] = airNumArr[1] - airNumArr[2];

						if (difArr[0] == difArr[1]) {
							ariSeqCnt++;
						}
					}
				}
			} else {
				ariSeqCnt = N;
			}

			bw.write(ariSeqCnt + "\n");
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
					br.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
		}
	}
}
