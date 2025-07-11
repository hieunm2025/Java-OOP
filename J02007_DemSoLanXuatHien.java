import java.util.*;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Map<Integer,Integer> frequency = new LinkedHashMap<>();
            for(int num : arr){
                frequency.put(num,frequency.getOrDefault(num,0) + 1);
            }
            System.out.println("Test " + t + ":");
            for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue()+ " lan");
            }
        }
    }
}
