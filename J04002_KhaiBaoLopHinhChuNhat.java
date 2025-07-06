package codeptit;

import java.util.Scanner;

public class J04002_KhaiBaoLopHinhChuNhat {
    static String standardizeColor(String s){
        if (s == null || s.isEmpty()) return "";
        s = s.toLowerCase();
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        String color = sc.next();
        
        if(a > 0 && b > 0){
            int perimeter = 2 * (a + b);
            int area = a * b;
            System.out.printf("%d %d %s\n",perimeter,area,standardizeColor(color));
        } else {
            System.out.println("INVALID");
        }
    }
}
