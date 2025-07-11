
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Tour[] tours = new Tour[n];
        for(int i = 0; i < n; i++){
            String tu = sc.nextLine();
            String den = sc.nextLine();
            double gia = Double.parseDouble(sc.nextLine());
            int soNguoi = Integer.parseInt(sc.nextLine());
            
            tours[i] = new Tour(tu,den,gia,soNguoi);
            tours[i].setMa(i+1);
        }
        for(Tour t : tours){
            System.out.println(t);
        }
    }
}
