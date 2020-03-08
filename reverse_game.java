import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(t>0){
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        
        int a[]=new int[n];
        int temp[]=new int[n];
        
        for(int i=0;i<n;i++) a[i]=i;

        for(int i=0;i<n;i++)
        {       int c=0;
            for(int j=i;j<n;j++)
            {   
                temp[n-c-1]=a[j]; 
                c++;    
            }
            for(int l=i;l<n;l++)
            {   
                a[l]=temp[l];     
            }

        }
        int f=0;
        for(f=0;f<n;f++) if(a[f]==k) break;
        System.out.println(f);
        t--;
}
    }
}
