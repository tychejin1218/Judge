package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_1546 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int N;
		int score = 0;
		Double maxValue = 0.0;
		Double totalValue = 0.0;
		String average = "";

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());

			if (N >= 1 && N <= 1000) {

				int numArrays[] = new int[N];

				st = new StringTokenizer(br.readLine());

				for (int a = 0; a < N; a++) {

					score = Integer.parseInt(st.nextToken());

					if (score > 0 && score <= 100) {
						numArrays[a] = score;
					}
				}

				for (int a = 0; a < numArrays.length; a++) {

					for (int b = a + 1; b < numArrays.length; b++) {

						if (numArrays[a] < numArrays[b]) {
							int numTemp = numArrays[a];
							numArrays[a] = numArrays[b];
							numArrays[b] = numTemp;
						}
					}

					totalValue += numArrays[a];
				}

				maxValue = (double) numArrays[0];
				average = String.format("%.2f" , (double) (totalValue / maxValue * 100.0 / N));
				
				bw.write(average + "\n");
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
