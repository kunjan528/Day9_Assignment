//import java.util.Scanner;


public class Assignment4 {
     public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

       
        int m = matrix.length;
        int n = matrix[0].length;

        int[] Row = new int[m];
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            Row[i] = min;
        }

        int[] Column = new int[n];
        for (int j = 0; j < n; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            Column[j] = max;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == Row[i] && matrix[i][j] == Column[j]) {
                    System.out.println("Lucky Number: " + matrix[i][j]);
                }
            }
        }
    }

   
}