//Java If-Else Example---Part of HackerRank Solutions- checking even/odd
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution_if_else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N>=1 && N<=100)
        {
         if(N%2!=0)
        {
            System.out.println("Weird");
            
        }else if((N%2==0)&&(N>=2 && N<=5))
        {
            System.out.println("Not Weird");
            
        }else if((N%2==0)&& (N>=6 && N<=20))
        {
            System.out.println("Weird");
            
        }else if (( N%2==0) && (N>20))
        {
            System.out.println("Not Weird");
            
        }
        }
        else{
            
        System.out.println("Out of range number, please enter a number between 1 to 100");    
        }
        scanner.close();
    }

}
