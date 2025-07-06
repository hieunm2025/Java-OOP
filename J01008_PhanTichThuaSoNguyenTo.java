package codeptit;

import java.util.Scanner;

public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            System.out.printf("Test %d: ",i);
            int can = (int)Math.sqrt((double)n);
            for(int j=2;j<=can;j++){
                int cnt=0;
                while(n%j==0){
                    n/=j;
                    cnt++;
                }
                if(cnt>0){
                    System.out.printf("%d(%d) ",j,cnt);
                }
            }
            if(n>1) System.out.printf("%d(1)",n);
            System.out.println("");
        }
    }
}
