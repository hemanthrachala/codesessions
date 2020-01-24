import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {
            
            int a = input.nextInt();
            
            int b = input.nextInt();
            
            int finalmaxnum = 0;
            
            int maxnum = 1;
            
            int temp = a;
            
            int temp1 = b;
            
            if(a>b) {
                
               a =  temp1;
                
               b = temp;
                
                
                
            }
        
            
            for(int i = a ; i <=b ; i++) {
                
                maxnum = 1;
                
                int j = i;
                
                while (j != 1 ) {
                
                    if(j%2 == 1) {
                    
                        j = (3*j)+1;
                    
                        maxnum++;
                    }
                    else if (j%2 == 0) {
                    
                        j = j/2;
                    
                        maxnum++;
                    
                    }
                    
                }
                if(maxnum > finalmaxnum) {
                
                finalmaxnum = maxnum;
                
            }
                
    
            }
            
            System.out.println(temp+" "+temp1+" "+finalmaxnum);
            
            
            
        }    
        
    }
}