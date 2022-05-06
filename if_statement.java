import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap so a: ");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println("Day la so chan");
            } else {
                System.out.println("Day la so le");
            }
        }
    }
}
