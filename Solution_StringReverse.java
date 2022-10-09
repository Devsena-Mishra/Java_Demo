import java.io.*;
import java.util.*;

public class Solution_StringReverse {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.length()<=50)
        {
            StringBuilder checkStr = new StringBuilder();
            checkStr.append(A);
            String newStr = checkStr.reverse().toString();
            if(A.equalsIgnoreCase(newStr)){
                System.out.println("Yes");
                
            }
            else{
                System.out.println("No");
            }
            
        }else
        {
            System.out.println("out of range...enter a string of max 50 letters");
        }
        
    }
}

