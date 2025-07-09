import java.util.Scanner;

public class J02014_DiemCanBang {
    public static int findBalancePoint(int[] arr){
        int n = arr.length;
        if(n==0){
            return -1;
        }
        long totalSum = 0;
        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        long leftSum = 0;
        for(int i = 0; i < n; i++){
            long rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int result = findBalancePoint(arr);
            System.out.println(result);
        }
    }
}
