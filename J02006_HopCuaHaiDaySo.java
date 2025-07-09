import java.util.*;

public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] exists = new boolean[1000];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            exists[x] = true;
        }
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            exists[x] = true;
        }
        boolean first = true;
        for(int i = 0; i < 1000; i++){
            if(exists[i]){
                if(!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
