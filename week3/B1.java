public class B1 {
    public static void main(String[] args) {
        Point A = new Point(1, -1),
              B = new Point(2, 1),
              C = new Point(4, 5);

        Point.baDiemThangHang(A, B, C);

        
        System.out.println("- Khoang cach giua hai diem A va B: " + Point.KhoangCach(A, B));
        System.out.println("- Khoang cach giua hai diem A va C: " + Point.KhoangCach(A, C));
        System.out.println("- Khoang cach giua hai diem B va C: " + Point.KhoangCach(B, C));
    }
}
