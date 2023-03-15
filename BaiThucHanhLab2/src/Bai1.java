import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a,b,tong=0,hieu=0,tich=0,thuong=0,soDu;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextInt();
        System.out.println("Nhap b:");
        b=sc.nextInt();
        tong=a+b;
        System.out.println("Tong cua 2 so vua nhap la:" +tong);
        hieu=a-b;
        System.out.println("Hieu 2 so vua nhap la:"+hieu);
        tich=a*b;
        System.out.println("Tich 2 so vua nhap la:"+tich);
        thuong=a/b;
        soDu=a%b;
        System.out.println("Thuong 2 so vua nhap la:"+thuong);
        System.out.println("So du la:"+soDu);
        if(a>b){
            System.out.println("So lon nhat la:"+a);
        }else if(a<b){
            System.out.println("Solon nhat la"+b);
        }
        sc.close();
    }
    
}
