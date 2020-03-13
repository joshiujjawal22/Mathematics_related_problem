import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static double solve(int[][] c) {
     double max=0;
       
         for(int i=0;i<c.length-1;i++){
             for(int j=i+1;j<c.length;j++){
     double s=Math.sqrt(Math.pow((c[i][0]-c[j][0]),2)+Math.pow((c[i][1]-c[j][1]),2));
     if(s>max) max=s;}
        }
        return max;
          }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] coordinates = new int[n][2];

        for (int coordinatesRowItr = 0; coordinatesRowItr < n; coordinatesRowItr++) {
            String[] coordinatesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int coordinatesColumnItr = 0; coordinatesColumnItr < 2; coordinatesColumnItr++) {
                int coordinatesItem = Integer.parseInt(coordinatesRowItems[coordinatesColumnItr]);
                coordinates[coordinatesRowItr][coordinatesColumnItr] = coordinatesItem;
            }
        }

        double result = solve(coordinates);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
