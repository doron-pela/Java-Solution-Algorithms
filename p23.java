import java.util.*;
import java.lang.*;

public class p23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int size = scanner.nextInt();
            int[] arrayA = new int[size];
            int[] arrayB = new int[size];
            int[] arrayC = new int[size];
            for (int i = 0; i < size; i++) {
                arrayA[i] = scanner.nextInt();
            }

            for (int i = 0; i < size; i++) {
                arrayB[i] = scanner.nextInt();
            }

            for (int i = 0; i < size; i++) {
                arrayC[i] = arrayA[i] + arrayB[i];
            }

            int k = size - 1;
            while (k > 0) {
                int pos = 0;
                int max = 0;
                for (int i = 0; i <= k; i++) {
                    if (arrayC[i] > max) {
                        max = arrayC[i];
                        pos = i;
                    }
                }
                int temp = arrayC[pos];
                arrayC[pos] = arrayC[k];
                arrayC[k] = temp;

                int tempA = arrayA[pos];
                arrayA[pos] = arrayA[k];
                arrayA[k] = tempA;

                int tempB = arrayB[pos];
                arrayB[pos] = arrayB[k];
                arrayB[k] = tempB;

                k--;
            }

            String A = "";
            String B = "";
            for (int i = 0; i < size; i++) {
                A = A + arrayA[i] + " ";
                B = B + arrayB[i] + " ";
            }

            System.out.println(A.trim());
            System.out.println(B.trim());

        }

        scanner.close();
    }
}