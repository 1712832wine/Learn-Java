import java.util.Scanner;

public class switch_statement {
    public static boolean isLeakYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap thang va nam: ");
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            int days;

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;
                    break;
                case 2:
                    if (isLeakYear(year)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                default:
                    days = 0;
            }
            System.out.println(month + "/" + year + " co " + days + " ngay.");
        }
    }
}
