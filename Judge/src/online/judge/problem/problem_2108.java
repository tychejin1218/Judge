package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem_2108 {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int N = Integer.parseInt(br.readLine());
			if (N >= 1 && N <= 500000) {

				double[] numArray = new double[N];

				for (int a = 0; a < N; a++) {

					long num = Integer.parseInt(br.readLine());
					long numAbs = Math.abs(num);

					if (numAbs <= 4000) {
						numArray[a] = num;
					} else {
						throw new Exception("입력되는 정수의 절댓값은 4,000을 넘습니다.");
					}
				}

				int arithmeticMean = getArithmeticMean(numArray);
				int median = getMedian(numArray);
				int mode = getMode(numArray);
				int difference = getDifference(numArray);

				bw.write(arithmeticMean + "\n");
				bw.write(median + "\n");
				bw.write(mode + "\n");
				bw.write(difference + "\n");
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
				}
			}
		}
	}

	static int getArithmeticMean(double[] numArray) {

		int result = 0;

		double numArraySum = 0;
		int numArrayLen = numArray.length;
		for (int a = 0; a < numArrayLen; a++) {
			numArraySum += numArray[a];
		}

		double arithmeticMean = numArraySum / numArrayLen;

		result = (int) Math.round(arithmeticMean);

		return result;
	}

	static int getMedian(double[] numArray) {

		int result = 0;

		Arrays.sort(numArray);

		int numArrayLen = numArray.length;
		if (numArrayLen == 1) {
			result = (int) numArray[0];
		} else {
			if (numArrayLen % 2 == 0) {

				int medianNum1 = numArrayLen / 2;
				int medianNum2 = (numArrayLen / 2) + 1;

				result = (int) (numArray[medianNum1] + numArray[medianNum2] / 2);

			} else {

				int medianNum = (numArrayLen / 2);
				result = (int) numArray[medianNum];
			}
		}

		return result;
	}

	static int getMode(double[] numArray) {

		int result = 0;

		HashMap<Double, Integer> numMap = new HashMap<Double, Integer>();

		int numArrayLen = numArray.length;
		for (int a = 0; a < numArrayLen; a++) {

			double numKey = numArray[a];

			if (numMap.containsKey(numKey)) {

				int numVal = numMap.get(numKey);

				numMap.put(numKey, numVal + 1);

			} else {

				numMap.put(numArray[a], 1);
			}
		}

		List<Integer> modeList = new ArrayList<Integer>();

		Map.Entry<Double, Integer> modeEntry = null;
		for (Map.Entry<Double, Integer> entry : numMap.entrySet()) {
			if (modeEntry == null || entry.getValue().compareTo(modeEntry.getValue()) >= 0) {
				modeEntry = entry;

			}
		}

		int maxVal = modeEntry.getValue();
		for (Double key : numMap.keySet()) {
			if (maxVal == numMap.get(key)) {
				modeList.add(key.intValue());
			}
		}

		int modeListSize = modeList.size();
		if (modeListSize == 1) {

			result = modeList.get(0);

		} else {

			Collections.sort(modeList, new compareAsc());

			if (modeListSize == 2) {

				int fMode = modeList.get(0);
				int sMode = modeList.get(1);

				if (fMode < 0 || sMode < 0) {
					result = modeList.get(1);
				} else {
					result = modeList.get(0);
				}			

			} else {
				result = modeList.get(1);
			}

		}

		return result;
	}

	static int getDifference(double[] numArray) {

		int result = 0;

		int numMax = (int) numArray[0];
		int numMin = (int) numArray[0];

		int numLen = numArray.length;

		for (int a = 0; a < numLen; a++) {

			int numCur = (int) numArray[a];

			if (numMax < numCur) {
				numMax = numCur;
			}

			if (numMin > numCur) {
				numMin = numCur;
			}
		}

		result = numMax - numMin;

		return result;
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
