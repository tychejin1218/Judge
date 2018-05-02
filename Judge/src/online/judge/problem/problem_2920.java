package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_2920 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;

		String result = "";

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());

			String[] scaleArray = new String[st.countTokens()];
			int cnt = 0;

			while (st.hasMoreElements()) {
				scaleArray[cnt] = st.nextToken();
				cnt++;
			}

			if ("1".equals(scaleArray[0]) && "2".equals(scaleArray[1]) && "3".equals(scaleArray[2])
					&& "4".equals(scaleArray[3]) && "5".equals(scaleArray[4]) && "6".equals(scaleArray[5])
					&& "7".equals(scaleArray[6]) && "8".equals(scaleArray[7])) {
				result = "ascending";
			} else if ("8".equals(scaleArray[0]) && "7".equals(scaleArray[1]) && "6".equals(scaleArray[2])
					&& "5".equals(scaleArray[3]) && "4".equals(scaleArray[4]) && "3".equals(scaleArray[5])
					&& "2".equals(scaleArray[6]) && "1".equals(scaleArray[7])) {
				result = "descending";
			} else {
				result = "mixed";
			}

			bw.write(result + "\n");
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
