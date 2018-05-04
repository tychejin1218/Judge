package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_8958 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int N = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());

			int scoreArrays[] = new int[N];

			for (int a = 0; a < N; a++) {

				String str = br.readLine();
				int score = 0;
				int socreTotal = 0;

				for (int b = 0; b < str.length(); b++) {

					String strOX = str.substring(b, b + 1);

					if ("O".equals(strOX)) {
						score++;
					} else if ("X".equals(strOX)) {
						score = 0;
					}

					socreTotal += score;
				}

				scoreArrays[a] = socreTotal;
			}

			for (int a = 0; a < scoreArrays.length; a++) {
				bw.write(scoreArrays[a] + "\n");
			}

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
