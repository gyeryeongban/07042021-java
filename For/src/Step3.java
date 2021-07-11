import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // // 구구단
        // int N = sc.nextInt();

        // if (1 <= N && N <= 9) {
        //     for (int i = 1; i <= 9; i++) {
        //         System.out.printf("%d * %d = %d\n", N, i, N * i);
        //     }
        // }

        // // A+B - 3
        // int T = sc.nextInt();
        // int A = 0;
        // int B = 0;
        // int[] arr = new int[T];

        // for (int i = 0; i < T; i++) {
        //     A = sc.nextInt();
        //     B = sc.nextInt();
        //     arr[i] = A + B;
        // }

        // for (int i = 0; i < T; i++) {
        //     System.out.println(arr[i]);
        // }

        // // 합
        // int n = sc.nextInt();
        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        //     System.out.println(sum);
        // }

        // // 빠른 A+B
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // T = Integer.parseInt(br.readLine());

        // StringTokenizer st;

		// for (int i = 0; i < N; i++) {
		// 	st = new StringTokenizer(br.readLine()," ");
		// 	bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		// }

		// br.close();
		// bw.flush();
		// bw.close();

        // // N 찍기
        // N = sc.nextInt();

        // if (N <= 100000) {
        //     for (int i = N - 1; i >= 0; i--) {
        //         System.out.println(N - i);
        //     }
        // }

        // // 기찍 N
        // N = sc.nextInt();

        // if (N <= 100000) {
        //     for (int i = 0; i < N; i++) {
        //         System.out.println(N - i);
        //     }
        // }

        // // A+B - 7
        // T = sc.nextInt();
        // A = 0;
        // B = 0;
        // arr = new int[T];

        // for (int i = 0; i < T; i++) {
        //     A = sc.nextInt();
        //     B = sc.nextInt();
        //     arr[i] = A + B;
        // }

        // for (int i = 0; i < T; i++) {
        //     System.out.printf("Case #%d: %d\n", i + 1, arr[i]);
        // }

        // A+B - 8
        int T = sc.nextInt();
        int A = 0;
        int B = 0;
        int arr[] = new int[T];

        for (int i = 0; i < T; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            arr[i] = A + B;
            
            System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, arr[i]);
        }
        
        // for (int j = 0; j < T; j++) {
        //     System.out.println(arr[j]);
        // }

        // // 별 찍기 - 1
        // N = sc.nextInt();

        // for (int i = 1; i <= N; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print('\n');
        // }

        // // 별 찍기 - 2
        // N = sc.nextInt();

        // for (int i = 1; i <= N; i++) {
        //     for (int j = 1; j <= N - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.print('\n');
        // }

        // // X보다 작은 수
        // N = sc.nextInt();
        // int X = sc.nextInt();
        // arr = new int[N];

        // for (int i = 0; i < N; i++) {
        //     A = sc.nextInt();
        //     arr[i] = A;
        // }

        // for (int i = 0; i < N; i++) {
        //     if (arr[i] < X) {
        //         System.out.print(arr[i] + " ");
        //     } else {
        //         continue;
        //     }
        // }
        sc.close();
    }
}
