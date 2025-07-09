import java.util.Scanner;

public class MangDanhDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a  = new int[n];
        
        int[] count = new int[1000001];
        
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            count[a[i]]++;
        }
        
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
