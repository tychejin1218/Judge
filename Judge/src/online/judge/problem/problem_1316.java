package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.logging.Logger;

public class problem_1316 {

    private static final Logger logger = Logger.getLogger( problem_1316.class.getName() );

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            int N = Integer.parseInt( br.readLine() );

            int groupWordCnt = 0;

            for ( int a = 0 ; a < N ; a ++ ) {

                String word = br.readLine();
                String wordChange = word.replaceAll("(.)\\1+", "$1");
                int wordChangeLen = word.length();
                
                if ( word.matches( "^[a-z]*$" ) ) {

                    if ( wordChangeLen <= 100 ) {

                        if ( getGroupWordCheck( wordChange ) ) {
                            groupWordCnt ++;
                        }

                    } else {
                        throw new Exception( "길이는 최대 100입니다." );
                    }

                } else {
                    throw new Exception( "소문자만 입력 가능합니다." );
                }
            }

            bw.write( groupWordCnt + "\n" );

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

    public static boolean getGroupWordCheck( String word ) {

        Boolean groupWord = true;

        int wordLen = word.length();

        String[] wordArray = new String[wordLen];

        for ( int a = 0 ; a < wordLen ; a ++ ) {
            wordArray[a] = word.substring( a , a + 1 );
        }

        LinkedList<String> wordList = new LinkedList<String>();

        for ( int a = 0 ; a < wordArray.length ; a ++ ) {

            int cnt = 0;

            for ( int b = 0 ; b < wordArray.length ; b ++ ) {

                if ( wordArray[a].equals( wordArray[b] ) ) {
                    cnt ++;
                }
            }

            if ( cnt >= 2 ) {

                int cnt2 = 0;

                for ( int c = 0 ; c < wordList.size() ; c ++ ) {

                    if ( wordArray[a] == wordList.get( c ) ) {
                        cnt2 ++;
                        break;
                    }
                }

                if ( cnt2 == 0 ) {
                    wordList.add( wordArray[a] );
                }
            }
        }

        if(wordList.size() > 0){
            groupWord = false;   
        }
        
        return groupWord;
    }
}