package online.judge.problem;

import java.util.Scanner;

public class problem_2893 {
	public static void main( String args[] ) {

        String str;

        int weightSugar = 0;
        int bag = 0;

        Scanner scanner = new Scanner( System.in );
        str = scanner.next();

        weightSugar = Integer.parseInt( str );

        if ( weightSugar >= 3 && weightSugar <= 5000 ) {

            int num05 = 0;
            int num03 = 0;
            int num = 0;

            Loop1 : for ( int a = 0 ; a <= 1000 ; a ++ ) {

                num05 = 5 * a;

                Loop2 : for ( int b = 0 ; b <= 1666 ; b ++ ) {

                    num03 = 3 * b;

                    if ( ( num03 != 0 ) && ( num03 % 5 == 0 ) ) {

                        break Loop2;

                    } else {

                        num = num05 + num03;

                        if ( num == weightSugar ) {

                            bag = a + b;
                            break Loop1;

                        } else {

                            bag = -1;
                        }
                    }
                }
            }
        }

        System.out.println( bag );
    }
}
