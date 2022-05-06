import java.util.Scanner;

public class using_math {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a,b: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("|a|: " + Math.abs(a));
        System.out.println("Min cua a,b: " + Math.min(a, b));
    }
}
