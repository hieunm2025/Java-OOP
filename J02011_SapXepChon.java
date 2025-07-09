import java.util.Scanner;

public class J02011_SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        selectionSort(a,n);
    }
    public static void selectionSort(int[] a , int n){
        int buoc = 1;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            //Hoandoi phan tu nho nhat voi phan tu tai i
            if(minIndex != i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            System.out.print("Buoc " + buoc + ": ");
            for (int k = 0; k < n; k++){
                System.out.print(a[k]);
                if (k < n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
            buoc++;
        }
    }
}
