import java.util.*;
import java.io.*;
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try(Scanner sc = new Scanner(x)){
            Map<Integer,Integer> a = new LinkedHashMap<>();
            while(sc.hasNext()){
                int n = sc.nextInt();
                a.put(n, a.getOrDefault(n,0) + 1);
            }
            a.forEach((key,value)->
            System.out.printf("%d %d\n",key,value));
        } catch(FileNotFoundException e){
            System.out.println("Cannot find file");
        }
    }
}
