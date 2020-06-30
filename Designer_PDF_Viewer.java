/*

When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:

PDF-highighting.png

In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

For example, the highlighted . Assume the heights of the letters are  and . The tallest letter is  high and there are  letters. The hightlighted area will be  so the answer is .

*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
            int len=word.length();
            int temp=0;
            int prev_max=0;
            for(int i=0;i<26;i++){
                
                for(int j=len-1;j>=0;j--){
                    char a=word.charAt(j);
                    //char b=word.charAt(j-1);
                    int c=(int)a-97;
                    //int d=(int)b-97;
                    
                    if(h[c]>=prev_max)
                    {   temp=prev_max;
                        prev_max=h[c];

                       
                    }
                    
                    System.out.print(temp);  
                }
               
            }

            
            int area=temp*len;
            return area;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
