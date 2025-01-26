import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- >= 1) {
            int n = scanner.nextInt();
            int[] s = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                s[i] = scanner.nextInt();
            }
            double count = 0;
            for (int i = 1; i <= n; i++) {
                if (i == s[i]) {
                    count++;
                }
            }
            System.out.println((int) Math.ceil(count / 2));
        }
        scanner.close();
    }
}