import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n,tong=0,a;
        float tbc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Day so gom bao nhieu phan tu");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap a:");
            a=sc.nextInt();
            tong+=a;
        }
        tbc=tong/n;
        System.out.println("Trung binh cong cac so da nhap la "+tbc);
        sc.close();
    }
    
}
