import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // A+B - 5
        int A, B = 0;

        while (true) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }

        // A+B - 4
        while (sc.hasNextInt()) {
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println(A + B);
        }

        // 더하기 사이클 [X]
        int N = sc.nextInt();
        int copy = N;
        int count = 0;

        if (0 <= N && N <= 99) {
            while (true) {
                N = ((N % 10) * 10) + ((N / 10) + (N % 10));
                count++;

                if (copy == N) {
                    break;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
