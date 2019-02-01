package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_2577 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		int A, B, C;
		int numCnt0 = 0;
		int numCnt1 = 0;
		int numCnt2 = 0;
		int numCnt3 = 0;
		int numCnt4 = 0;
		int numCnt5 = 0;
		int numCnt6 = 0;
		int numCnt7 = 0;
		int numCnt8 = 0;
		int numCnt9 = 0;
		int numCntArrays[] = new int[10];

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			A = Integer.parseInt(br.readLine());
			B = Integer.parseInt(br.readLine());
			C = Integer.parseInt(br.readLine());

			if ((A >= 100 && A <= 1000) && (B >= 100 && B <= 1000) && (C >= 100 && C <= 1000)) {

				String result = String.valueOf(A * B * C);

				for (int a = 0; a < result.length(); a++) {

					String numResult = result.substring(a, a + 1);

					if ("0".equals(numResult)) {
						numCnt0++;
					} else if ("1".equals(numResult)) {
						numCnt1++;
					} else if ("2".equals(numResult)) {
						numCnt2++;
					} else if ("3".equals(numResult)) {
						numCnt3++;
					} else if ("4".equals(numResult)) {
						numCnt4++;
					} else if ("5".equals(numResult)) {
						numCnt5++;
					} else if ("6".equals(numResult)) {
						numCnt6++;
					} else if ("7".equals(numResult)) {
						numCnt7++;
					} else if ("8".equals(numResult)) {
						numCnt8++;
					} else if ("9".equals(numResult)) {
						numCnt9++;
					}
				}

				numCntArrays[0] = numCnt0;
				numCntArrays[1] = numCnt1;
				numCntArrays[2] = numCnt2;
				numCntArrays[3] = numCnt3;
				numCntArrays[4] = numCnt4;
				numCntArrays[5] = numCnt5;
				numCntArrays[6] = numCnt6;
				numCntArrays[7] = numCnt7;
				numCntArrays[8] = numCnt8;
				numCntArrays[9] = numCnt9;
			}

			for (int a = 0; a < numCntArrays.length; a++) {
				bw.write(numCntArrays[a] + "\n");
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