import java.util.Scanner;

public class App {
    public static boolean main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        boolean sc_prime(int num) {
            if (num == 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
