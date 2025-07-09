import java.util.*;

public class J02004_MangDoiXung {
    public static boolean isSymmetric(int[] arr, int n){
        for(int i = 0; i < n / 2; i++){
            if(arr[i] != arr[n - 1 -i]){
                return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n;i++){
                arr[i] = sc.nextInt();
            }
            if(isSymmetric(arr, n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
