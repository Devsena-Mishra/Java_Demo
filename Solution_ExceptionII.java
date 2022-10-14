import java.io.*;
import java.util.*;

public class Solution_ExceptionII 
{

    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
      
       try{
       try{
       
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        System.out.println(""+(x/y));
       }catch(InputMismatchException e)
       {
           System.out.println(e.getClass().getName());
        } }
     catch(Exception e1)
       {
        System.out.println(e1);
           
       }
}
}
