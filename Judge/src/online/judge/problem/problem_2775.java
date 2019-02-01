package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problem_2775 {

    static int[][] roomArray = new int[15][14];

    public static void main( String[] args ) {

        setRoomArray();

        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            int T = Integer.parseInt( br.readLine() );
            int[] result = new int[T];
            for ( int a = 0 ; a < T ; a ++ ) {

                int k = Integer.parseInt( br.readLine() );
                int n = Integer.parseInt( br.readLine() );

                result[a] = roomArray[k][n - 1];
            }

            for ( int a = 0 ; a < result.length ; a ++ ) {
                bw.write( result[a] + "\n" );
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

    static private void setRoomArray() {

        for ( int a = 0 ; a < roomArray.length ; a ++ ) {

            if ( a == 0 ) {

                for ( int b = 0 ; b < roomArray[a].length ; b ++ ) {

                    roomArray[a][b] = b + 1;
                }

            } else {

                for ( int b = 0 ; b < roomArray[a].length ; b ++ ) {

                    if ( b == 0 ) {
                        roomArray[a][b] = 1;
                    } else {
                        roomArray[a][b] = roomArray[a][b - 1] + roomArray[a - 1][b];
                    }
                }
            }
        }
    }
}