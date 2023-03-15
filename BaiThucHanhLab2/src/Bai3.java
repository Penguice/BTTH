import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a;
        String hoten;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho va ten:");
        hoten=sc.nextLine();
        System.out.println("Nhap tuoi:");
        a=sc.nextInt();
        if(a<18){     
        if (a<16){
            System.out.printf("Ban %s o do tuoi vi thanh nien",hoten);
        }else if(a>=16){
            System.out.printf("Ban %s o do tuoi truong thanh",hoten);
        }
        }if(a>=18){
            System.out.printf("Ban %s da gia");
        }else if(a<=0){
            System.out.println("Do tuoi khong hop le");
        }
        sc.close();        
    }
    
}
