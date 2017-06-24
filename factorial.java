import java.io.*;
import java.util.*;

public class Solution {
    public static int factorial(int n){
        if (n == 1) return 1;
        else{
            return (n*factorial(n-1));
        }
      
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println( factorial(N) );
            
    }
}
