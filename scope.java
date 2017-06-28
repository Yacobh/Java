import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    // Add your code here
    Difference(int[] a){
        elements = new int [a.length];
        for (int i = 0; i < a.length; i++){
            elements[ i ] = a[ i ];
        }
    }

    void computeDifference(){
        int max = 0;
        int min = 101;
        int diff;
        for (int i = 0; i < elements.length; i++){
            if ( ( elements[i] ) > max ) max = elements[i];
            if ( ( elements[i] ) < min ) min = elements[i];
        }
        maximumDifference = max - min;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
