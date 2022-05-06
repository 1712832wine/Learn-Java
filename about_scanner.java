import java.util.Scanner;

/**
 * about_scanner
 */
public class about_scanner {

    private static final String NHAP_VAO_HO_VA_TEN = "Nhap vao ho va ten: ";
    private static final String NHAP_MA_SINH_VIEN = "Nhap ma sinh vien: ";
    private static final String NHAP_VAO_DIEM_THI = "Nhap vao diem thi: ";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(NHAP_VAO_HO_VA_TEN);
            String HoVaTen = sc.nextLine();

            System.out.println(NHAP_MA_SINH_VIEN);
            long MaSinhVien = sc.nextLong();

            System.out.println(NHAP_VAO_DIEM_THI);
            Float DiemThi = sc.nextFloat();

            System.out.println("Ho Va Ten: " + HoVaTen);
            System.out.println("Ma Sinh Vien: " + MaSinhVien);
            System.out.println("Diem Thi: " + DiemThi);
        }
    }
}