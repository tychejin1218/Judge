package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class problem_2908 {

    private static final Logger logger = Logger.getLogger( problem_2908.class.getName() );

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;
        StringTokenizer st = null;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
            st = new StringTokenizer( br.readLine() );

            int stLen = st.countTokens();
            String[] numArray = new String[stLen];

            for ( int a = 0 ; a < stLen ; a ++ ) {

                String numChange = "";
                String num = st.nextToken();
                int numLen = num.length();

                if ( numLen == 3 ) {

                    for ( int b = numLen , c = 0 ; b > 0 ; b -- , c ++ ) {
                        numChange += num.substring( ( numLen - 1 ) - c , numLen - c );
                    }

                    numArray[a] = numChange;

                } else {

                    throw new Exception( "세자리 숫자만 입력 가능합니다." );
                }
            }

            bw.write( Collections.max( Arrays.asList( numArray ) ) + "\n" );

        } catch ( Exception e ) {
            logger.info( e.getMessage() );
        } finally {
            if ( br != null ) {
                try {
                    br.close();
                } catch ( Exception e ) {
                    logger.info( e.getMessage() );
                }
            }
            if ( bw != null ) {
                try {
                    bw.close();
                } catch ( Exception e ) {
                    logger.info( e.getMessage() );
                }
            }
        }
    }
}