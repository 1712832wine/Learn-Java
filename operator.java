import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        // Tinh + - * / % cho a va b
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao a va b: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("a + b: " + (a + b));
            System.out.println("a - b: " + (a - b));
            System.out.println("a * b: " + (a * b));
            System.out.println("a / b: " + ((float) a / b));
            System.out.println("a % b: " + (a % b));

        }

    }
}
