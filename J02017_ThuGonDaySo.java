
import java.util.Scanner;
import java.util.Stack;

public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && (arr[i] + st.peek()) % 2 == 0) {
                st.pop();
            } else {
                st.push(arr[i]);
            }
        }
        System.out.println(st.size());
    }
}
