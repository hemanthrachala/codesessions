import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String a = "";
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for(int i = 0; i <arr.length ; i++) {
                for(int j = arr[i].length() - 1 ; j >= 0 ; j-- ){
                    a = a + arr[i].charAt(j);
                    
            }
            a = a + "  ";
        }System.out.println(a);  
        }
    }
}