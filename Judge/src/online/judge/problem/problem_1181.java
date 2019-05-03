package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class problem_1181 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int N = Integer.parseInt(br.readLine());
			if (N >= 1 && N <= 20000) {

				List<String> alphabetList = new ArrayList<String>();

				for (int a = 0; a < N; a++) {
					
					String alphabet = br.readLine();

					alphabetList.add(alphabet);
				}
				
				List<String> deduplicationList = new ArrayList<String>();

				for (String str : alphabetList) {
					if (!deduplicationList.contains(str)) {
						deduplicationList.add(str);
					}
				}

				Collections.sort(deduplicationList, new compareAsc());
				
				Collections.sort(deduplicationList, new compareLength());
							
				for(String str : deduplicationList){
					bw.write(str + "\n");
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
					e.getMessage();
				}
			}
		}
	}
	
	static class compareAsc implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	}

	static class compareLength implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			return Integer.compare(o1.length(), o2.length());
		}
	}
}
