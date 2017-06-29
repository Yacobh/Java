import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();    
        in.close();
        int a;
        try{
           a = Integer.parseInt(S);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
            return;
        }
        System.out.println(a);
        return;
    }
}
