import java.util.*;

public class J03005_ChuanHoaXauHoTen2 {
    public static String capitalize(String word){
        if(word.isEmpty()) return "";
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }
    public static String chuanHoaTen(String fullName){
        fullName = fullName.trim().replaceAll("\\s+"," ").toLowerCase();
        String[] words = fullName.split(" ");
        
        if (words.length < 2) return "";
        
        StringBuilder result = new StringBuilder();
        for(int i = 1;i < words.length;i++){
            result.append(capitalize(words[i])).append(" ");
        }
        return result.toString().trim() + ", " + words[0].toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n;i++){
            String name = sc.nextLine();
            if(!name.trim().isEmpty()){
                System.out.println(chuanHoaTen(name));
            }
        }
    }
}
