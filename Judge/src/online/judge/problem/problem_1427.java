package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class problem_1427 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			String result = "";
			
			int N = Integer.parseInt(br.readLine());
			if (N >= 1 && N <= 1000000000) {

				List<Integer> listNum = new ArrayList<Integer>();

				String strNum = Integer.toString(N);
				int strNumLen = strNum.length();

				for (int a = 0; a < strNumLen; a++) {
					listNum.add(Character.getNumericValue(strNum.charAt(a)));
				}

				Collections.sort(listNum, new compareDesc());

				for (Integer num : listNum) {
					result += num;
				}
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

	static class compareAsc implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
	}

	static class compareDesc implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	}
}
