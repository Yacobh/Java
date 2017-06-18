import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();       
        for (int j = 0; j < T; j++){
            String myString = in.nextLine();
            char[] myCharArray = myString.toCharArray();
            //print even numbers
            for(int i = 0; i < myString.length(); i = i + 2 ){
                System.out.print(myCharArray[i]); 
            }
            // print the whitespace
            System.out.print (" ");
            //
            for(int i = 1; i < myString.length(); i = i + 2 ){
                System.out.print(myCharArray[i]); 
            }
            // Print a newline
            System.out.println();     
        }
       in.close();
        
    }
}
