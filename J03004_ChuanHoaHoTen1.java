
import java.util.Scanner;

public class J03004_ChuanHoaHoTen1 {

    public static String chuanHoa(String s) {
        s = s.toLowerCase().trim().replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String input = sc.nextLine();
            System.out.println(chuanHoa(input));
        }
    }
}