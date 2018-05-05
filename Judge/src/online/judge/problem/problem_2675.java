package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_2675 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int T = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			T = Integer.parseInt(br.readLine());

			String[] strArray = new String[T];

			if (T >= 1 && T <= 1000) {

				for (int a = 0; a < T; a++) {

					String str = "";
					st = new StringTokenizer(br.readLine());

					for (int b = 0; b < st.countTokens(); b++) {

						int R = Integer.parseInt(st.nextToken());
						String word = st.nextToken();

						if (R >= 1 && R <= 8) {

							for (int c = 0; c < word.length(); c++) {

								for (int d = 0; d < R; d++) {

									str += Character.toString(word.charAt(c));
								}
							}
						}						
					}

					strArray[a] = str;
				}
			}

			for (int a = 0; a < strArray.length; a++) {
				bw.write(strArray[a] + "\n");
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
