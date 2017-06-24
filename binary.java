import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int single = input.nextInt();
        String binary = Integer.toBinaryString(single);
        char[] array = binary.toCharArray();
        int max = 0;
        int buffer = 0;
        for ( int i = 0; i < binary.length(); i++){
            if (array[i] == '1')
                buffer++;
            else{
                if (buffer > max) max = buffer;
                buffer = 0;
            }
        }
        System.out.println(max);
    }
}
