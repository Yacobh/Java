import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int max_sum(int[][]  A){
        //set the minimum posible value to the max variable
        int max = -64;
        int sum;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                // maake the sum according to the hourglass algorithm
                sum = A[i][j] + A[i][j+1]+ A[i][j+2]
                              + A[i+1][j+1]
                    + A[i+2][j] + A[i+2][j+1]+ A[i+2][j+2];
                //make the comparissionn
                if ( sum > max ) max = sum;
            }
        }
        // return the max value
        return max;    
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(max_sum(arr));
    }
}
