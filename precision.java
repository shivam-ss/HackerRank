/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

*/

==================== SOLUTION =======================


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
            int[] a=arr.clone();
            int b=arr.length;
            double cp=0;
            double cn=0;
            double cz=0;
            for(int i=0;i<b;i++){
                if(a[i]>0){
                    cp=cp+1;
                }
                else if(a[i]==0){
                    cz=cz+1;
                }
                else{
                    cn++;
                }
            }
            double sum=cp+cz+cn;
            double ans1=cp/sum;
            double ans2=cn/sum;
            double ans3=cz/sum;
            System.out.print(ans1+"\n"+ans2+"\n"+ans3);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
