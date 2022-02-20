import java.util.Scanner;

public class Sort {
    public static void sort(int[] a, int n){
        int m, temp;
        for(int i = 0; i < n-1; i++){
            m = i;
            for(int j = i+1; j < n; j++){
                if(a[j] < a[m]){
                    m = j;
                }
            }
            if(m != i){
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
        }
    }

    public static int binarySearch(int[] a, int left, int right, int x){
        if(right >= 1){
            int mid = left + (right-1) /2;
            if(a[mid] == x){
                return mid;
            }
            if(a[mid] > x){
                return binarySearch(a, left, mid-1, x);
            }
            return binarySearch(a, mid+1, right, x);
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhap vao so luong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        // Nhap mang
        for(int i = 0; i < n; i++){
            System.out.printf("\t+ a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        // Sap xep
        sort(a,n);
        System.out.println("- In ra day so da sap sep:");
        for(int i = 0; i < n; i++){
            System.out.printf("\t+ a[%d]: %d\n", i, a[i]);
        }
        // tim kiem
        System.out.print("- Nhap vao gia tri muon tim: ");
        int x = sc.nextInt();
        int index =  binarySearch(a, 0, n-1, x);
        if(index == -1){
            System.out.printf("\t+ %d xuat hien tai index = %d\n", x, index);
        }
        else {
            System.out.printf("\t+ %d xuat hien tai index = %d\n", x, index);
        }
    }
}