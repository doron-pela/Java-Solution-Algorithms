import java.util.*;

public class p22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            int count = 0;
            int j = n - 1;
            int i = 0;
            int min;

            while (i < j) {
                min = 0;
                for (int k = 0; k <= i; k++) {
                    if (a[i - k][j - k] < min) {
                        min = a[i - k][j - k];
                    }
                }
                count = count - min;
                i++;
            }
            while (j >= 0) {
                min = 0;
                for (int k = 0; k <= j; k++) {
                    if (a[i - k][j - k] < min) {
                        min = a[i - k][j - k];
                    }
                }
                count = count - min;
                j--;
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
