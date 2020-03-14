import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        
        int c=0;
        for(int i=0;i<=n-1;i++)
        {  
            for(int j=i+1;j<=n;j++)
            {
            if(check(s.substring(i,j))) c++;
            }   
        }
        return c;
    }
        static boolean check(String s){
            int c=0;
            int n=s.length();
            for(int i=0;i<n-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1)) c++;    
            }
            if(c==n-1) return true;
            else if(c==n-3 && n%2!=0 && s.charAt(n/2)!=s.charAt(0) && s.charAt(0)==s.charAt(n-1)) return true; 
            else return false; 
        }
    
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
