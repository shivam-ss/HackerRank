import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    //creating two arrays:
          int len=arr.length;
          int []a=new int[len];
          int []b= new int[len];
          //we will store elements in one array and index in next array
            int count=0;
          for(int i=0;i<len;i++){
              b[i]=i+1;
              if(arr[i]!=b[i]){
                // int j=arr[i]-1;
                
                // int temp=arr[j];
                // arr[j]=arr[i];
                // arr[i]=temp;
                
                // count++;
                if(arr[i]<i+1){
                    
                }

                  
              }
              
          }
         // System.out.println(count);
          return count;
                

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
