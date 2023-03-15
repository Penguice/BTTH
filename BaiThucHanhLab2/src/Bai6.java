import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int a;
        long n=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so nguyen a:");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            n=n*i;
        }
        System.out.println("Giai thua cua "+a+" la:"+n);
        sc.close();
    }
}
