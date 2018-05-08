package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

public class problem_5622 {

    private static final Logger logger = Logger.getLogger( problem_5622.class.getName() );

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            String word = br.readLine();
            int wordLen = word.length();

            int second = 0;

            for ( int a = 0 ; a < wordLen ; a ++ ) {
                
                if ( Character.isUpperCase( word.substring( a , a + 1 ).charAt( 0 ) ) ) {

                    second += getSecond(word.substring( a , a + 1 )) + 1;
                    
                } else {
                    
                    throw new Exception( "대문자만 입력 가능합니다." );
                }
            }

            bw.write( second + "\n" );
            
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

    public static int getSecond( String str ) {

        int second = 0;

        if ( "A".equals( str ) || "B".equals( str ) || "C".equals( str ) ) {
            second = 2;
        } else if ( "D".equals( str ) || "E".equals( str ) || "F".equals( str ) ) {
            second = 3;
        } else if ( "G".equals( str ) || "H".equals( str ) || "I".equals( str ) ) {
            second = 4;
        } else if ( "J".equals( str ) || "K".equals( str ) || "L".equals( str ) ) {
            second = 5;
        } else if ( "M".equals( str ) || "N".equals( str ) || "O".equals( str ) ) {
            second = 6;
        } else if ( "P".equals( str ) || "Q".equals( str ) || "R".equals( str ) || "S".equals( str ) ) {
            second = 7;
        } else if ( "T".equals( str ) || "U".equals( str ) || "V".equals( str ) ) {
            second = 8;
        } else if ( "W".equals( str ) || "X".equals( str ) || "Y".equals( str ) || "Z".equals( str ) ) {
            second = 9;
        }

        return second;

    }
}