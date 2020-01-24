import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String line;
        int a = 0;
        while(s.hasNextLine()) {
            line = s.nextLine();
            for(int i = 0 ; i < line.length(); i++) {
                if(line.charAt(i) == '"') {
                    if(a%2 == 0) System.out.print("``"); 
                    else System.out.print("''"); 
                    a++;
                } else {
                    System.out.print(line.charAt(i));
                }
            }
            System.out.println();
        }      
    }
}
