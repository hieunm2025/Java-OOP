import java.util.Scanner;

public class UclnCuaMotHangTrongMaTran {
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void solve(Scanner sc){
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i = 0; i < m; i++){
            //Khoi tao USCLN cua hang bang chinh phan tu dau tien
            int rowGcd = sc.nextInt();
            //Duyet qua cac phan tu con lai tren hang do(tu cot thu 2)
            for(int j = 1;j < n; j++){
                int currentElement = sc.nextInt();
                //Cap nhap  USCLN cua hang
                rowGcd = gcd(rowGcd,currentElement);
            }
            System.out.println(rowGcd + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }
}
