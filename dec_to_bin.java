import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao n: ");
            int n = scanner.nextInt();
            String result = "";
            while (n > 0) {
                result = n % 2 + result;
                n /= 2;
            }
            System.out.println("Ket qua: " + result);
        }

    }
}
