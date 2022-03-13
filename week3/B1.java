public class B1 {
    public static void main(String[] args) {
        Point A = new Point(1, -1);
        Point B = new Point(2, 1);
        Point C = new Point(4, 5);

        Point.baDiemThangHang(A, B, C);

        double khoangCach = Point.KhoangCach(A, B);
        System.out.println("- Khoang cach giua hai diem A va B: "+khoangCach);
    }
}
