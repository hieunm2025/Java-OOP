import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07001_DocFileVanBan {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        Scanner sc = null;
        try{
            sc = new Scanner(x);
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch(FileNotFoundException e){
            System.out.println("Cannot find file DATA.in");
        }finally{
            if(sc != null){
                sc.close();
            }
        }
    }
   
}
