import java.util.Scanner;

public class PrimeRowFinder {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRowAllPrime(int[] row) {
        for (int num : row) {
            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimeRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (isRowAllPrime(matrix[i])) {
                System.out.print(i + " ");
            }
    }
        System.out.println();
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++ ) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("Test " + (t + 1) + ": \n");
            findPrimeRows(matrix);
        }
        sc.close();
    }
}
