
import java.util.*;

public class p8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int score = a[k - 1];
        int countOfPlayers = 0;

        for (int j = 0; j < n; j++) {
            if (a[j] >= score && (a[j] > 0)) {
                countOfPlayers++;
            } else if (a[j] < score) {
                break;
            }
        }

        System.out.println(countOfPlayers);
        sc.close();

    }
}
