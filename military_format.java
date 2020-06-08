import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
         char ch1=s.charAt(8);
         String str2=s.substring(0,2);
         String str3=s.substring(2,8);
         
         int a=Integer.valueOf(str2);
         

         if(ch1=='P' && a!=12){
              a=a+12;
         }
         else if(ch1=='A' && a==12){
             a=a-12;
             String temp=String.valueOf(a);
             String temp2="0".concat(temp);
             String str5=temp2.concat(str3);
             return str5;
         }
         else if(ch1=='A' && a<12){
             String temp=String.valueOf(a);
             String temp2="0".concat(temp);
             String str5=temp2.concat(str3);
             return str5;
         }
         String str4=String.valueOf(a);
         String str5=str4.concat(str3);
        // System.out.println(str5);
         return str5;
         

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
