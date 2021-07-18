// 손익분기점

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        /* A = 고정 비용
            B = 가변 비용
            c = 상품 가격 */
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 상품 가격이 가변 비용보다 적으면 손해
        if (C <= B) {
            System.out.println(-1);
        } else {
            // + 1을 해야 수익 발생
            System.out.println((A/(C-B))+1);
        }
        sc.close();
    }
}
