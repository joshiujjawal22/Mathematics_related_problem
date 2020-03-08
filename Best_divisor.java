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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        int c=0;
        int max=0;
        int ans=0;
        for(int i=1;i<=n;i++)
        {       int tmp_i=i;
                int sum=0;
            if(n%i==0) {
                
            while(tmp_i>0){
                sum+=tmp_i%10;
                tmp_i/=10;
            }
            
            }
            if(sum>max) {max=sum;ans=i;}
        }
        System.out.print(ans);
    }
}
