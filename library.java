import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int Dactual = sc.nextInt();
        int Mactual = sc.nextInt();
        int Yactual = sc.nextInt();
        int Dexpected = sc.nextInt();
        int Mexpected = sc.nextInt();
        int Yexpected = sc.nextInt();
        //int cost;
        //int fine;
        int daysLate = Dactual - Dexpected;
        int monthsLate = Mactual - Mexpected;
        if ( (Yactual - Yexpected) < 0 ){
            System.out.println('0');
            return;
        } else if (monthsLate < 0 && (Yactual - Yexpected) == 0){
            System.out.println('0');
            return;
        }
        System.out.println((Yactual - Yexpected != 0) ? 10000
            : (monthsLate > 0) ? monthsLate * 500
            : (daysLate > 0) ? daysLate * 15
            : 0);
        
    }
}
