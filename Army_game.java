import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the gameWithCells function below.
     */
    static int gameWithCells(int n, int m) {
        int s=0;
        
       if(n%2==0) s+=(n/2);
       else s+=(n/2)+1;
       if(m>2){
       if(m%2==0) s=s*((m/2));
       else s=s*((m/2)+1);
       }
       
       return s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int result = gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
