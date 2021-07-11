import java.util.Arrays;
import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    // 최소, 최대
    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    System.out.printf("%d %d", arr[0], arr[N - 1]);

    sc.close();
    }
}
