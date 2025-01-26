import java.util.*;

public class p14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int count = 0;
        int row = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        count = count + (Math.abs(row - 2));
        count = count + (Math.abs(column - 2));

        System.out.println(count);
        scanner.close();
    }
}
