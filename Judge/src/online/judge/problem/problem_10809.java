package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_10809 {

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        String[] alphabetArray = { "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" };
        String[] resultArray = new String[26];

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            String word = br.readLine();
            String[] wordArray = new String[word.length()];
            for ( int a = 0 ; a < word.length() ; a ++ ) {
                wordArray[a] = Character.toString( word.charAt( a ) );
            }

            for ( int a = 0 ; a < alphabetArray.length ; a ++ ) {
                for ( int b = 0 ; b < wordArray.length ; b ++ ) {
                    if ( alphabetArray[a].equals( wordArray[b] ) ) {
                        resultArray[a] = String.valueOf( b );
                        break;
                    } else {
                        resultArray[a] = "-1";
                    }
                }
            }

            for ( int a = 0 ; a < resultArray.length ; a ++ ) {

                bw.write( resultArray[a] );

                if ( a < resultArray.length - 1 ) {
                    bw.write( " " );
                }
            }
            
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
