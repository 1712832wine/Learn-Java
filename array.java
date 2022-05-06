import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap n:");
            int n = scanner.nextInt();
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = i;
                System.out.println("a[" + i + "]: " + a[i]);
            }
        }
        int b[] = new int[] { 1, 2, 3 };
        System.out.println("b[0]: " + b[0]);
    }
}
