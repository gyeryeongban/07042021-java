import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) throws Exception {
        // Hello World
        System.out.println("Hello World!");

        // We love kriii
        System.out.println("강한친구 대한육군\n강한친구 대한육군");

        // 고양이
        System.out.println("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|");

        // 개
        System.out.println("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|");

        // A+B, A-B, A×B
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > 0 && B < 10) {
            System.out.println(A + B);

            System.out.println(A - B);

            System.out.println(A * B);
        }

        // A/B
        float C = sc.nextFloat();
        float D = sc.nextFloat();

        if (C > 0 && D < 10) {
            System.out.println(C / D);
        }

        // 사칙연산
        A = sc.nextInt();
        B = sc.nextInt();

        if (A >= 1 && B <= 10000) {
            System.out.println(A + B);

            System.out.println(A - B);

            System.out.println(A * B);

            System.out.println(A / B);

            System.out.println(A % B);
        }

        // 나머지
        A = sc.nextInt();
        B = sc.nextInt();
        int E = sc.nextInt();

        if (2 <= A && A <= 10000 &&
            2 <= B && B <= 10000 &&
            2 <= E && E <= 10000) {
            System.out.println((A + B) % E);

            System.out.println(((A % E) + (B % E)) % E);
            
            System.out.println((A * B) % E);
            
            System.out.println(((A % E) * (B % E)) % E);
        }

        // 곱셈
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A * (B % 10));

        System.out.println(A * ((B % 100) / 10));

        System.out.println(A * (B / 100));

        System.out.println(A * B);

        sc.close();
    }
}
