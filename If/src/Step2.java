import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) throws Exception {
        // 두 수 비교하기
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else if (A == B) {
            System.out.println("==");
        }

        // 시험 성적
        int score = sc.nextInt();

        if (0 <= score && score <= 100) {
            if (90 <= score && score <= 100) {
                System.out.println('A');
            } else if (80 <= score && score <= 89) {
                System.out.println('B');
            } else if (70 <= score && score <= 79) {
                System.out.println('C');
            } else if (60 <= score && score <= 69) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }
        }

        // 윤년
        int year = sc.nextInt();

        if (1 <= year && year <= 4000) {
            if (year % 4 == 0 &&
            !(year % 100 == 0) ||
            year % 400 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        // 시분면 고르기
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (-1000 <= x && x <= 1000 && x != 0 &&
        -1000 <= y && y <= 1000 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println(1);
            } else if (x < 0 && y < 0) {
                System.out.println(2);
            } else if (x < 0 && y < 0) {
                System.out.println(3);
            } else if (x > 0 && y < 0) {
                System.out.println(4);
            }
        }

        // 알람 시계
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (0 <= H && H <= 23 &&
        0 <= M && M <= 59) {
            if ((M - 45) < 0) {
                System.out.println((H - 1) + " " + (M + 15));
            }
        }

        sc.close();
    }
}
