package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class problem_2751 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			List<Integer> listN = new ArrayList<Integer>();

			int N = Integer.parseInt(br.readLine());
			if (N >= 1 && N <= 1000000) {
				for (int a = 0; a < N; a++) {
					listN.add(Integer.parseInt(br.readLine()));
				}
			}

			Collections.sort(listN, new compareAsc());

			Iterator<Integer> iterator = listN.iterator();
			while (iterator.hasNext()) {
				bw.write((iterator.next()) + "\n");
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
