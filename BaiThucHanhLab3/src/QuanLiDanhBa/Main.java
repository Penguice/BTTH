package QuanLiDanhBa;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Contactab db=new Contactab();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap kich thuoc danh ba: ");
        int A=sc.nextInt();
        String arrTen[]=new String[A];
        String arrSDT[]=new String[A];
        db.Insert(arrTen, arrSDT);
        db.Delete(arrTen, arrSDT);
        db.Update(arrTen, arrSDT);
        db.SearchbyName(arrTen, arrSDT);
        sc.close();
    }
}

