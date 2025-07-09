
import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().trim();

        int count = 0;
        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
