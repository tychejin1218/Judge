package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.logging.Logger;

public class problem_11718 {

    private static final Logger logger = Logger.getLogger( problem_11718.class.getName() );

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        LinkedList<String> strList = new LinkedList<String>();

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            for ( int a = 0 ; a < 100 ; a ++ ) {
                String str = br.readLine();
                if ( str == null) {
                    break;
                } else {
                    strList.add( str );
                }
            }

            for ( int a = 0 ; a < strList.size() ; a ++ ) {
                bw.write( strList.get( a ) );
                bw.newLine();
            }
            
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
