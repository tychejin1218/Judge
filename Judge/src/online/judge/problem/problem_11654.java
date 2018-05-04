package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_11654 {

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        String str;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            str = br.readLine();

            int ascll = str.charAt( 0 );

            bw.write( ascll + "\n" );
            bw.flush();

        } catch ( Exception e ) {
            e.getMessage();
        } finally {
            if ( br != null ) {
                try {
                    br.close();
                } catch ( Exception e ) {
                    e.getMessage();
                }
            }
            if ( bw != null ) {
                try {
                    bw.close();
                } catch ( Exception e ) {
                    e.getMessage();
                }
            }
        }
    }
}
