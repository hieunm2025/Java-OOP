import java.util.*;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] setA = new boolean[1000];
        boolean[] setB = new boolean[1000];
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            setA[x] = true;
        }
        
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            setB[x] = true;
        }
        
        boolean first = true;
        for (int i = 0;i < 1000; i++){
            if(setA[i] && setB[i]){
                if(!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
