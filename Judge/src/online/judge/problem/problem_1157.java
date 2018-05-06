package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class problem_1157 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		Map<String, Integer> alphabetMap = new HashMap<String, Integer>();
		String[] alphabetArray = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		for (int a = 0; a < alphabetArray.length; a++) {
			alphabetMap.put(alphabetArray[a], 0);
		}

		String word = "";
		String result = "";

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			word = br.readLine();
			word = word.toUpperCase();
			int wordLen = word.length();

			if (wordLen <= 1000000) {

				String[] wordArray = new String[wordLen];
				for (int a = 0; a < wordLen; a++) {
					wordArray[a] = Character.toString(word.charAt(a));
				}

				for (int a = 0; a < wordArray.length; a++) {

					for (int b = 0; b < alphabetArray.length; b++) {

						if (alphabetArray[b].equals(wordArray[a])) {

							int alphabetCnt = alphabetMap.get(wordArray[a]);

							alphabetMap.replace(alphabetArray[b], alphabetCnt + 1);
						}
					}
				}

				int maxValue = 0;
				for (int value : alphabetMap.values()) {
					if (value > maxValue) {
						maxValue = value;
						result = String.valueOf(getKey(alphabetMap, value));
					} else if (value == maxValue) {
						result = "?";
					}
				}

				bw.write(result + "\n");
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

	public static Object getKey(Map<String, Integer> m, Object value) {

		for (Object o : m.keySet()) {
			if (m.get(o).equals(value)) {
				return o;
			}
		}

		return null;
	}

}
