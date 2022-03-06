package week2;

public class Bai1 {
    public static int fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n <= 0){
            return -1;
        }
        else if(n == 1) {
            return n;
        }
        else {
            for(int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    public static void main(String[] args) {
        System.out.println("Viet chuong trinh tinh tong cua day so Fibonacci den so Fibonacci < 100.");
        int tongFibo = 0;
        for(int i = 1; i <= 100; i++) {
            if(fibo(i) >= 100) {
                break;
            }
            tongFibo += fibo(i);
        }
        System.out.println("- Tong day so Fibonacci = " + tongFibo);
    }
}
