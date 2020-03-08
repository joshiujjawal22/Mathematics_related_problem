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
        int c=n-1;
        int i=0;
        for(i=0;i<n;i+=2){ a[i]=c;c--;}
        c=0;
        for(i=1;i<n;i+=2) {a[i]=c;c++;} 
        for(i=0;i<n;i++) if(a[i]==k) break;
        System.out.println(i);
        t--;
}
    }
}
