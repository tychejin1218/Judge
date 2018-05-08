package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class problem_sample {

	private static final Logger logger = Logger.getLogger( problem_sample.class.getName() );

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		StringTokenizer st = null;
		
		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			st = new StringTokenizer(br.readLine());
			
			st.hasMoreTokens();
			bw.write(st.hasMoreTokens() + "\n");
			
			int count = st.countTokens();
			
			String str = st.nextToken();
									
			bw.write(str + "\n");
			bw.write(count + "\n");
			
			bw.flush();

		} catch (Exception e) {
			logger.info(e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					logger.info(e.getMessage());
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					logger.info(e.getMessage());
				}
			}
		}
	}
}
