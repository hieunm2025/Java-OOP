import java.util.*;

public class TinhPI {
    public static double tinhPi(double epsilon){
        double pi = 0.0;
        int n = 1;
        double term;
        
        do{
            term = Math.pow(-1, n + 1) / (2 * n - 1);
            pi += term;
            n++; 
        } while (Math.abs(term) > epsilon);
        return pi * 4;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        String epsilonLine = sc.nextLine();
        String[] epsilonValues = epsilonLine.split("\\s+");
        
        for(int i = 0; i < t; i++){
            double epsilon = Double.parseDouble(epsilonValues[i]);
            double result = tinhPi(epsilon);
            System.out.printf("%.15f\n",result);
        }
    }
}