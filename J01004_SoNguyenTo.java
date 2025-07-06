
import java.util.Scanner;

public class J01004_SoNguyenTo {

    static boolean nt(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();
        while (t > 0) {
            t--;
            long n = reader.nextLong();
            if (nt(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
