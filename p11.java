import java.util.*;

public class p11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problems = scanner.nextInt();
        int superSum = 0;
        while (problems-- > 0) {
            int[] problem = new int[3];
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                problem[i] = scanner.nextInt();
                if (problem[i] == 1) {
                    sum++;
                }
            }
            if (sum >= 2) {
                superSum++;
            }
        }
        System.out.println(superSum);
        scanner.close();
    }
}
