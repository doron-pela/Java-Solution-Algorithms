import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] list = new long[n];
        List<Long> posIntegers = new ArrayList<>();
        List<Long> negIntegers = new ArrayList<>();
        List<Long> zeros = new ArrayList<>();
        long cost = 0;
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextLong();
            if (list[i] > 0) {
                posIntegers.add(list[i]);
                if (list[i] > 1) {
                    cost = cost + (list[i] - 1);
                }

            } else if (list[i] < 0) {
                negIntegers.add(list[i]);
                if (list[i] < -1) {
                    cost = cost + Math.abs((list[i] + 1));
                }

            } else {
                zeros.add(list[i]);
            }
        }

        if (zeros.isEmpty()) {
            if (negIntegers.size() % 2 != 0) {
                cost = cost + 2;
            }
        } else {
            cost = cost + zeros.size();
        }

        System.out.println(cost);
        scanner.close();

    }
}