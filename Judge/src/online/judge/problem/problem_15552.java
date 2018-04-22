package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_15552 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int A = 0;
		int B = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int T = Integer.parseInt(br.readLine());

			String[] abArrays = new String[T];

			if (T <= 1000000) {

				for (int a = 0; a < T; a++) {

					st = new StringTokenizer(br.readLine());

					A = Integer.parseInt(st.nextToken());
					B = Integer.parseInt(st.nextToken());

					if (A >= 1 && A <= 1000) {

						if (B >= 1 && B <= 1000) {

							abArrays[a] = Integer.toString(A + B);
						}
					}
				}

				for (int a = 0; a < abArrays.length; a++) {

					bw.write(abArrays[a] + "\n");
					bw.flush();
				}
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
