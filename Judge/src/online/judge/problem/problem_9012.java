package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class problem_9012 {

    static LinkedList<String> listResult = null;

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            listResult = new LinkedList<String>();

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            int N = Integer.parseInt( br.readLine() );

            for ( int a = 0 ; a < N ; a ++ ) {

                String str = br.readLine();

                listResult.add( getVPS( str ) );
            }

            if ( listResult.size() > 0 ) {
                for ( String listResult : listResult ) {
                    bw.write( listResult + "\n" );
                }
            }

        } catch ( Exception e ) {
            e.getMessage();
        } finally {
            if ( bw != null ) {
                try {
                    bw.close();
                } catch ( Exception e ) {
                    e.getMessage();
                }
            }
        }
    }

    private static String getVPS( String str ) {

        String result = "YES";
        
        LinkedList<String> list = new LinkedList<String>();
        
        int strLen = str.length();
        if ( strLen > 0 ) {

            String firstStr = str.substring( 0 , 1 );
            String lastStr = str.substring( strLen - 1 , strLen );

            if ( !( "(".equals( firstStr ) ) ) {
                result = "NO";
            } else if ( !( ")".equals( lastStr ) ) ) {
                result = "NO";
            } else {

                boolean removeYN = false;
                
                for ( int a = 0 ; a < strLen ; a ++ ) {
                    
                    String tempStr = str.substring( a , a + 1 );
                    
                    if ( "(".equals( tempStr ) ) {

                        if ( removeYN ) {
                            if ( list.size() != 0 ) {
                                result = "NO";
                                break;
                            }
                        } else {
                            list.add( tempStr );
                            removeYN = false;
                        }

                    } else if ( ")".equals( tempStr ) ) {
                        
                        if ( list.size() > 0 ) {
                            list.removeFirst();
                            removeYN = true;
                        } else {
                            result = "NO";
                            break;
                        }
                    }
                }

                if ( list.size() > 0 ) {
                    result = "NO";
                }
            }
        }

        return result;
    }
}