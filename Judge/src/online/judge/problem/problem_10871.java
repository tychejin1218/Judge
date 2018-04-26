package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class problem_10871 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int N, X, A;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			X = Integer.parseInt(st.nextToken());

			LinkedList<Integer> numList = new LinkedList<>();

			if ((N >= 1 && N <= 10000) && (X >= 1 && X <= 10000)) {

				st = new StringTokenizer(br.readLine());

				for (int a = 0; a < N; a++) {

					A = Integer.parseInt(st.nextToken());

					if (A < X) {
						numList.add(A);
					}
				}

				for (int a = 0; a < numList.size(); a++) {
					bw.write(numList.get(a).toString());
					if(a < numList.size() - 1){
						bw.write(" ");
					}
				}

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
