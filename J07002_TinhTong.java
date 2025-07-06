import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("DATA.in");
        try(Scanner sc = new Scanner(x)){
            long s = 0;
            while(sc.hasNext()){
                try{
                   String t = sc.next();
                   s += Integer.parseInt(t);
                }catch(NumberFormatException e){
                    
                }
            }
            System.out.println(s);
        }catch(FileNotFoundException e){
            System.out.println("Cannot find file DATA.in");
        }
    }
}
