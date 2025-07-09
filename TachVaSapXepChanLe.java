import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TachVaSapXepChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x % 2 == 0){
                even.add(x);
            } else{
                odd.add(x);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        
        for(int x : even) {
            System.out.print(x + " ");
        }
        for(int x : odd){
            System.out.print(x + " ");
        }
    }
}
