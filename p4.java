import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Stack<Integer> screen = new Stack<>();
        // int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            if (!screen.contains(m)) {
                if (screen.size() == k) {
                    screen.remove(0);
                    screen.add(m);
                } else {
                    screen.add(m);
                }
            } else {
                continue;
            }
        }
        System.out.println(screen.size());
        String ans = "";
        while (!screen.empty()) {
            ans = ans + screen.pop() + " ";
        }

        System.out.println(ans.trim());

        scanner.close();
    }
}