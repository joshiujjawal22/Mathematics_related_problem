import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the primeCount function below.
     */
    static int primeCount(long n) {
    //     long product=1;
    //     int j=1;
    //     int c=0;
    //     for(int i=2;i<1000;i++)
    // {
    //             if(i==2 && product*i<=n)  {product*=i;c++;}
    //             else if(i==3 && product*i<=n) {product*=i;c++;}
    //             else if(i==6*j-1) { 
    //                 if(product*(6*j-1)<=n) {product=product*(6*j-1);c++;}
    //                 else break;
    //                 if(product*(6*j+1)<=n) {product=product*(6*j+1);c++;}
    //                 else break;
    //                 j++;
    //                 }
    //             else continue;    
    // }
    // return c;

    // Another Way
    int[] prime={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
if(n==1) return 0;
long multi = 1;
int count =0;
for(int i =0;i<prime.length;i++){

      multi*=prime[i];
      if(multi<=n && multi>0) {count ++;}
      else break;
}
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
