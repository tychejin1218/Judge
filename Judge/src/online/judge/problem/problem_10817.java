package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_10817 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int A, B, C;
		int numArrays[] = new int[3];
		String result = "";

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			A = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			if ((A >= 1 && A <= 100) && (B >= 1 && B <= 100) && (C >= 1 && C <= 100)) {

				numArrays[0] = A;
				numArrays[1] = B;
				numArrays[2] = C;

				for (int a = 0; a < numArrays.length; a++) {

					for (int b = a + 1; b < numArrays.length; b++) {

						if (numArrays[a] > numArrays[b]) {
							int numTemp = numArrays[a];
							numArrays[a] = numArrays[b];
							numArrays[b] = numTemp;
						}
					}
				}

				result = String.valueOf(numArrays[1]);

				bw.write(result + "\n");
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
