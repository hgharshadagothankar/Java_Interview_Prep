

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxMinSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long maxSum = 0,minSum = 0,temp;
        
        long arr[]=new long[]{a,b,c,d,e};
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
        for (int i = 0; i < (arr.length-1); i++) {
			minSum=minSum+arr[i];
		}
        for (int i = (arr.length-1); i >=1; i--) {
        	System.out.println("a[i]--"+arr[i]+"--max--"+maxSum);
        	maxSum=maxSum+arr[i];
		}
        System.out.println("minSum=="+minSum+" max==="+maxSum);
        
    }
}