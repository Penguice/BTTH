import java.util.Scanner;

public class HinhTruTron 
{   float r,h;
    double chuvi,dientich,thetich;
    final double Pi=3.14159;
    Scanner sc=new Scanner(System.in);
  void nhapthongtin()
{
    System.out.print("Nhap ban kinh: ");
    r=sc.nextFloat();
    System.out.print("Nhap chieu cao: ");
    h=sc.nextFloat();
}
  void inthongtin()
{
    chuvi=2*2*r*Pi;
    System.out.printf("Chu vi hinh tru tron co ban kinh %f chieu cao %f = %f",r,h,chuvi);
    dientich=2*Pi*Math.pow(r,2)+2*Pi*r*h;
    System.out.printf("Dien tich hinh tru tron co ban kinh %f chieu cao %f = %f",r,h,dientich);
    thetich=Pi*Math.pow(r,2)*h;
    System.out.printf("The tich hinhon co ban kinh %f chieu cao %f = %f",r,h,thetich);
}
}

    



