import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            
            int H = s.nextInt();
            if(H == 0) break;
            double U = s.nextInt();
            double D = s.nextInt();
            double F = s.nextInt();
            // System.out.println(H+" "+U+" "+D+" "+F);
            
            
            double fatigue = (F/100) * U;
            
            int day = 0 ;
            
            double climbed = 0;
                
            while(true) {
                
                day = day + 1 ;
                
                climbed = climbed + U;
                
                if(climbed > H) { System.out.println("success on day"+" "+day); break; }
                
                climbed = climbed - D;
                
                U = U - fatigue;
                           
                if(climbed < 0) { System.out.println("failure on day"+" "+day); break;}
                      
                
            }    
           
            
        }
    }
}