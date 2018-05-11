package online.judge.problem;

public class problem_4673 {

    static int       numMax     = 10000;

    static boolean[] numSelfArr = new boolean[numMax];

    public static void main( String[] args ) {

        for ( int a = 0 ; a < numMax ; a ++ ) {

            int numSelf = dn( a );

            if ( numSelf < numMax ) {

                numSelfArr[numSelf] = true;
            }
        }

        for ( int a = 0 ; a < numSelfArr.length ; a ++ ) {

            if ( !numSelfArr[a] ) {
                System.out.println( a );
            }
        }
    }

    public static int dn( int num ) {

        int result = num;

        if ( num >= 10000 ) {
            result += num / 10000;
            num %= 10000;
        }

        if ( num >= 1000 ) {
            result += num / 1000;
            num %= 1000;
        }

        if ( num >= 100 ) {
            result += num / 100;
            num %= 100;
        }

        if ( num >= 10 ) {
            result += num / 10;
            num %= 10;
        }

        return result += num;
    }
}