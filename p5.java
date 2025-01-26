import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int w = scanner.nextInt();
            int[] prices = new int[w];
            for (int i = 0; i < w; i++) {
                prices[i] = scanner.nextInt();
            }
            int count = 0;
            int min = prices[prices.length - 1];
            for (int i = prices.length - 1; i >= 0; i--) {
                if (prices[i] > min) {
                    count++;
                } else {
                    min = prices[i];
                    continue;
                }
            }

            System.out.println(count);

        }

        scanner.close();
    }
}