import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList <String> lines = new ArrayList<String>();
        
        while(scan.hasNext())
        {
        lines.add(scan.nextLine()); 
        }
        scan.close();
        //Priniting output
        int i=1;
        for(String str:lines)
        {
         System.out.println(i+" "+str);
         i++;
        }
        
    }
}
