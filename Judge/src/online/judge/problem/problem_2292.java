package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_2292 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int roomNum = Integer.parseInt(br.readLine());
			int roomCnt = 1;
			int roomDisMin = 0;

			if (roomNum >= 1 && roomNum <= 1000000000) {

				if (roomNum == 1) {

					roomDisMin++;

				} else {

					while (roomCnt < roomNum) {
						roomCnt += (6 * roomDisMin);
						roomDisMin++;
					}
				}

				bw.write((roomDisMin) + "\n");
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