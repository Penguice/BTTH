
import java.util.Scanner;

public class Slide35 {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen a: ");
        a = scanner.nextInt();
        System.out.print("Nhap so nguyen b: ");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println("So nho nhat la:" + b);
        } else if (a < b) {
            System.out.println("So nho nhat la:" + a);
        }
        scanner.close();
    }

}
