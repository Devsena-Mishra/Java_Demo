import java.io.*;
import java.util.*;

public class Solution_String {

    public static String capitalizeInitial(String str)
    {
       if(str== null || str.isEmpty())
       {
           
           return str;
       }
       else{
       return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();  
       }
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lengthA = A.length();
        int lengthB = B.length();
        int sumlength = lengthA+lengthB;
        System.out.println(sumlength);
         int compareStrings= A.compareTo(B);
        if(compareStrings >0)
        {
            
            System.out.println("Yes");
            
        } 
        else if(compareStrings<0) {
            
            System.out.println("No");
        }
        else{
            
            System.out.println("No");
        }
        String a1 = capitalizeInitial(A);
        String b1 = capitalizeInitial(B);
        System.out.println(a1+" "+b1);
        
        
    
    }
}
