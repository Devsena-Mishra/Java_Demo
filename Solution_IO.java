//Simple IO Operations using java StdIn and Stdout
import java.util.*;
import java.io.*;

public class Solution_IO {

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int a = scan.nextInt();
        scan.close();

        System.out.println("myString is:"+str);
        System.out.println("myInt is:"+a);
       **/
    BufferedReader buffread1 = new BufferedReader(new InputStreamReader(System.in));
    try{
    int x = Integer.parseInt(buffread1.readLine());
    int y = Integer.parseInt(buffread1.readLine());
    int z = Integer.parseInt(buffread1.readLine());
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
        
    } catch(IOException exception)
    {
        System.out.println("Exception:"+exception);
        
    }
        
        
        
        
    }
}
