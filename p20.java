import java.util.*;

public class p20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum = sum + a[i];
            }
            int min = 0;
            if (sum > 0) {
                if (sum < n) {
                    min = 1;
                } else {
                    min = sum - n;
                }
            } else {
                min = 1;
            }

            System.out.println(min);
        }
        scanner.close();
    }
}
