package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class problem_10989 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int N = Integer.parseInt(br.readLine());
			if (N >= 1 && N <= 10000000) {

				int[] numArray = new int[N];

				for (int a = 0; a < N; a++) {

					int N2 = Integer.parseInt(br.readLine());
					if (N2 > 0 && N2 <= 10000) {
						numArray[a] = N2;
					} else {
						throw new Exception("10,000보다 작거나 같은 자연수가 아닙니다.");
					}
				}

				Arrays.sort(numArray);

				for (int a = 0; a < N; a++) {
					bw.write((numArray[a]) + "\n");
				}
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
				}
			}
		}
	}
}
