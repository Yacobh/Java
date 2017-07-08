import java.io.*;
import java.util.*;

public class Solution {

    public static void check( int p){
        int flag = 0;
        for( int i = 2; i*i <= p; i++){
            if ( p%i == 0){
                flag = 1;
                break;
            }
        }
        if (flag == 0 )
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        for ( int i = 0; i < N; i++){
            int prime = scan.nextInt();
            check(prime);
        }
    }
}
