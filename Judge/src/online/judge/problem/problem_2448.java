package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_2448 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int N = Integer.parseInt(br.readLine());

			String starMap[] = new String[N];
			starMap[0] = "  *  ";
			starMap[1] = " * * ";
			starMap[2] = "*****";

			for (int k = 1; 3 * (int) Math.pow(2, k) <= N; k++) {				
				drawStar(k, starMap);
			}

			for (int a = 0; a < N; ++a) {
				bw.write(starMap[a]);
				bw.newLine();
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

	private static void drawStar(int k, String map[]) {
		
		int bottom = 3 * (int) Math.pow(2, k);
		int middle = bottom / 2;
		for (int a = middle; a < bottom; a++) {
			map[a] = map[a - middle] + " " + map[a - middle];
		}

		String space = "";
		while (space.length() < middle) {
			space += " ";
		}
		for (int a = 0; a < middle; a++) {
			map[a] = space + map[a] + space;
		}
		
	}
}
