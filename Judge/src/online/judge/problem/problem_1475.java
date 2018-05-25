package online.judge.problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class problem_1475 {

    static int[][] roomArray = new int[15][14];

    public static void main( String[] args ) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader( new InputStreamReader( System.in ) );
            bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

            String roomNum = br.readLine();

            int setNum = setRoomNumChk( roomNum );

            bw.write( setNum + "\n" );

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

    static private int setRoomNumChk( String roomNum ) {

        List<Integer> roomNumList = new ArrayList<Integer>();

        int[] roomNumArr = new int[roomNum.length()];
        for ( int a = 0 ; a < roomNum.length() ; a ++ ) {
            roomNumArr[a] = Integer.parseInt( roomNum.substring( a , a + 1 ) );
        }

        for ( int a = 0 ; a < roomNumArr.length ; a ++ ) {

            int cnt = 0;
            for ( int b = 0 ; b < roomNumArr.length ; b ++ ) {

                if ( roomNumArr[a] == roomNumArr[b] ) {
                    cnt ++;
                }
            }

            if ( cnt >= 2 ) {

                int cnt2 = 0;
                for ( int c = 0 ; c < roomNumList.size() ; c ++ ) {

                    if ( roomNumArr[a] == roomNumList.get( c ) ) {

                        cnt2 ++;
                        break;
                    }
                }

                if ( cnt2 == 0 ) {
                    roomNumList.add( roomNumArr[a] );
                }
            }
        }

        int setCnt = 1;
        for ( int a = 0 ; a < roomNumList.size() ; a ++ ) {
            int cnt = 0;
            for ( int b = 0 ; b < roomNumArr.length ; b ++ ) {

                if ( roomNumList.get( a ) == roomNumArr[b] ) {
                    cnt ++;
                }
            }

            if ( roomNumList.get( a ) == 6 ) {
                int cnt9 = 0;
                for ( int b = 0 ; b < roomNumArr.length ; b ++ ) {
                    if ( roomNumArr[b] == 9 ) {
                        cnt9 ++;
                    }
                }
                cnt = ( int ) Math.ceil( ( cnt - cnt9 ) / 2.0 ) + cnt9;
            }

            if ( roomNumList.get( a ) == 9 ) {
                int cnt6 = 0;
                for ( int b = 0 ; b < roomNumArr.length ; b ++ ) {
                    if ( roomNumArr[b] == 6 ) {
                        cnt6 ++;
                    }
                }
                cnt = ( int ) Math.ceil( ( cnt - cnt6 ) / 2.0 ) + cnt6;
            }
            
            if ( setCnt < cnt ) {
                setCnt = cnt;
            }
        }

        return setCnt;
    }
}