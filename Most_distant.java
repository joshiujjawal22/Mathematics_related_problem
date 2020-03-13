import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static double solve(int[][] c) {
//         Naive Solution in O(n*n)
//      double max=0;
       
//          for(int i=0;i<c.length-1;i++){
//              for(int j=i+1;j<c.length;j++){
//      double s=Math.sqrt(Math.pow((c[i][0]-c[j][0]),2)+Math.pow((c[i][1]-c[j][1]),2));
//      if(s>max) max=s;}
//         }
//         return max;
//     }
        
        
//     Efficient method to solve the problem in O(n)
     double max_x=0,min_x=0,max_y=0,min_y=0;
         
        for(int i=0;i<c.length;i++)
        {   if(min_x>c[i][0]) min_x=c[i][0];
            if(min_y>c[i][1]) min_y=c[i][1];
            if(max_x<c[i][0]) max_x=c[i][0];
            if(max_y<c[i][1]) max_y=c[i][1];
        }
        double max=max_x-min_x;
        if(max_y-min_y>max) max=max_y-min_y;
        if(Math.sqrt(Math.pow((max_x),2)+Math.pow((min_y),2))>max) max=Math.sqrt(Math.pow((max_x),2)+Math.pow((min_y),2));
        if(Math.sqrt(Math.pow((max_x),2)+Math.pow((max_y),2))>max) max=Math.sqrt(Math.pow((max_x),2)+Math.pow((max_y),2)); 
if(Math.sqrt(Math.pow((min_x),2)+Math.pow((min_y),2))>max) max=Math.sqrt(Math.pow((min_x),2)+Math.pow((min_y),2));
        if(Math.sqrt(Math.pow((min_x),2)+Math.pow((max_y),2))>max) max=Math.sqrt(Math.pow((min_x),2)+Math.pow((max_y),2)); 
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
