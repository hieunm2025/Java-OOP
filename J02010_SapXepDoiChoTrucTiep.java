import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // Nhập mảng
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sắp xếp đổi chỗ trực tiếp (interchange sort)
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    swapped = true;
                }
            }

            // Nếu có ít nhất 1 lần đổi chỗ, in ra bước
            if (swapped) {
                System.out.print("Buoc " + step + ": ");
                for (int k = 0; k < n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
                step++;
            }
        }
    }
}
