import java.util.Scanner;

public class J02013_SapXepNoiBot {
    static void printStep(int[] a, int step){
        System.out.printf("Buoc %d: ", step);
        for(int num : a){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static boolean isSorted(int[] a){
        for (int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            boolean swapped = false;
            for(int j = 0;j < n - 1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            printStep(a,i+1);
            if(!swapped || isSorted(a)){
                break;
            }
        }
    }
}