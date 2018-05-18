package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_1193 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int X = Integer.parseInt(br.readLine());
			int fraNumCnt = 0;
			int fraNumTot = 0;
			int fraNumLine = 0;
			int fraNumPos = 0;

			while (fraNumTot < X) {
				fraNumTot += fraNumCnt;
				fraNumCnt++;
			}

			fraNumLine = fraNumCnt - 1; // 대각선 라인번호

			if (fraNumLine % 2 != 0) { // 라인이 홀수일 때

				fraNumPos = fraNumTot - X + 1;

			} else { // 라인이 짝수일 때

				fraNumPos = X - (fraNumTot - fraNumCnt) - 1;
			}

			String fraNum = "";
			for (int a = 0; a < fraNumLine; a++) {

				if (fraNumPos == a + 1) {
					fraNum = (a + 1) + "/" + (fraNumLine - a);
					break;
				}
			}

			bw.write(fraNum + "\n");

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