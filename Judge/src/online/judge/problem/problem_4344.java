package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class problem_4344 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		int C = 0;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			C = Integer.parseInt(st.nextToken());

			if (C > 0) {

				LinkedList<String[]> scoreList = new LinkedList<String[]>();

				for (int a = 0; a < C; a++) {
					
					st = new StringTokenizer(br.readLine());
					
					scoreList.add(getStringTokenizerToArray(st));
				}

				for (int a = 0; a < scoreList.size(); a++) {

					String[] scoreArrayTemp = scoreList.get(a);

					int student = 0;
					int studentAbove = 0;
					Double studentRate = 0.0;

					Double score = 0.0;
					Double total = 0.0;
					Double average = 0.0;

					student = Integer.parseInt(scoreArrayTemp[0]);

					if (student >= 1 && student <= 1000) {

						for (int b = 1; b < scoreArrayTemp.length; b++) {

							score = Double.parseDouble(scoreArrayTemp[b]);

							if (score >= 0 && score <= 100) {
								total += score;
							}
						}
						average = total / (double) student;

						for (int b = 1; b < scoreArrayTemp.length; b++) {

							score = Double.parseDouble(scoreArrayTemp[b]);

							if (score >= 0 && score <= 100) {

								if (score > average) {
									studentAbove++;
								}
							}
						}

						studentRate = ((double) studentAbove / (double) student * 100);

						bw.write(String.format("%.3f", studentRate) + "%\n");
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

	private static String[] getStringTokenizerToArray(StringTokenizer st) {

		int arrayCount = 0;
		String[] array = new String[st.countTokens()];

		while (st.hasMoreTokens()) {
			array[arrayCount++] = st.nextToken();
		}

		return array;
	}
}
