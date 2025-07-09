import java.util.Scanner;

public class J01010_CatDoi {
    static String cutDigit(char c){
        switch(c){
            case '0': return "0";
            case '1': return "1";
            case '8':
            case '9': return "0";
            default: return "INVALID";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for(int t = 0; t < tests; t++){
            String input = sc.nextLine().trim();
            StringBuilder result =  new StringBuilder();
            boolean valid = true;
            
            for(char ch : input.toCharArray()){
                String cut = cutDigit(ch);
                if(cut.equals("INVALID")){
                    valid = false;
                    break;
                }
                result.append(cut);
        }
            if(!valid){
                System.out.println("INVALID");
            } else {
                String trimmed = result.toString().replaceFirst("^0+","");
                System.out.println(trimmed.isEmpty() ? "INVALID" : trimmed);
            }
        }      
    }
}