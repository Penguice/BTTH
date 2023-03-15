import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, tong=0;
        while(tong<100){
            System.out.println("Nhap x:");
            x=sc.nextInt();
            tong = tong+x;
        }
        System.out.println("Tong cac so da nhap=" +tong);
        sc.close();
    }
}
