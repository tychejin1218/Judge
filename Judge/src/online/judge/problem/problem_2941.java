package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Logger;

public class problem_2941 {

    private static final Logger logger = Logger.getLogger( problem_2941.class.getName() );

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
            
            String word = br.readLine();
            String wordChange = setWordChange( word );
            
            bw.write( wordChange.length() + "\n" );
            
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

    public static String setWordChange( String str ) {

        if ( str.contains( "c=" ) ) {
            str = str.replace( "c=" , "1" );
        } 
        
        if ( str.contains( "c-" ) ) {
            str = str.replace( "c-" , "1" );
        } 
        
        if ( str.contains( "dz=" ) ) {
            str = str.replace( "dz=" , "1" );
        } 
        
        if ( str.contains( "d-" ) ) {
            str = str.replace( "d-" , "1" );
        } 
        
        if ( str.contains( "lj" ) ) {
            str = str.replace( "lj" , "1" );
        } 
        
        if ( str.contains( "nj" ) ) {
            str = str.replace( "nj" , "1" );
        }
        
        if ( str.contains( "s=" ) ) {
            str = str.replace( "s=" , "1" );
        } 
        
        if ( str.contains( "z=" ) ) {
            str = str.replace( "z=" , "1" );
        }

        return str;
    }
}