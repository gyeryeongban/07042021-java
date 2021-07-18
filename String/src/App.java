// 아스키 코드

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextLine().charAt(0);

        System.out.println(input);

        sc.close();
    }
}
