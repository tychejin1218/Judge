package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class problem_10828 {

    static List<Integer> listStack  = null;
    static List<Integer> listResult = null;

    public static void main( String[] args ) {
        
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            listStack  = new ArrayList<Integer>();
            listResult = new ArrayList<Integer>();
            
            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            int N = Integer.parseInt( br.readLine() );

            for ( int a = 0 ; a < N ; a ++ ) {

                String command = br.readLine();

                if ( command.contains( "push" ) ) {
                    String[] commandArr = command.split( " " );
                    setPush( Integer.parseInt( commandArr[1] ) );
                } else if ( "pop".equals( command ) ) {
                    listResult.add( setPop() );
                } else if ( "size".equals( command ) ) {
                    listResult.add( getSize() );
                } else if ( "empty".equals( command ) ) {
                    listResult.add( getEmpty() );
                } else if ( "top".equals( command ) ) {
                    listResult.add( getTop() );
                }
            }

            if ( listResult.size() > 0 ) {
                for ( int listResult : listResult ) {
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

    private static void setPush( int num ) {
        listStack.add( num );
    }

    private static int setPop() {

        int result = 0;
        int listStackSize = listStack.size();

        if ( listStackSize > 0 ) {
            result = listStack.get( listStackSize - 1 );
            listStack.remove( listStackSize - 1 );
        } else {
            result = -1;
        }

        return result;
    }

    private static int getSize() {
        return listStack.size();
    }

    private static int getEmpty() {

        int reuslt = 0;
        int listStackSize = getSize();

        if ( listStackSize > 0 ) {
            reuslt = 0;
        } else {
            reuslt = 1;
        }

        return reuslt;
    }

    private static int getTop() {

        int result = 0;
        int listStackSize = listStack.size();

        if ( listStackSize > 0 ) {
            result = listStack.get( listStackSize - 1 );
        } else {
            result = -1;
        }

        return result;
    }
}