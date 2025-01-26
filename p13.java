import java.util.*;

public class p13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] square = new int[2];
        for (int i = 0; i < square.length; i++) {
            square[i] = scanner.nextInt();
        }

        int area = square[0] * square[1];
        System.out.println((int) Math.floor(area / 2));

        scanner.close();
    }
}
