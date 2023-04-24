package QuanLiDanhBa;
import java.util.Scanner;

public class Contactab extends Contact{
   
    public void  Insert(String arrTen[],String arrSDT[]){
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<arrTen.length;i++)
      {
      System.out.print("\nNhap ten :");
      arrTen[i]=sc.nextLine();
      System.out.print("\nNhap SDT cua " + arrTen[i] +":");
      arrSDT[i]=sc.nextLine();
      }
}
    public void  Delete(String arrTen[],String arrSDT[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("\nNhap ten lien he can xoa:");
      String Ten=sc.nextLine();
      boolean x=true;
      for(int i=0;i<arrTen.length;i++)
      { if(arrTen[i].equals(Ten))
        {
        arrTen[i]="null";
        arrSDT[i]="null";
        x=false;
        }
        }
      if(x==true)
      {
        System.out.print("\nTen ko ton tai trong danh ba");
      }
   }
    public void  Update(String arrTen[],String arrSDT[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("\nNhap ten lien he can sua SDT:");
      String ten=sc.nextLine();
      boolean x=false;
      for(int i=0;i<arrTen.length;i++)
      {
        if(arrTen[i].equals(ten))
        {
        System.out.print("\nNhap Sdt moi cua "+ten+" :");
        arrSDT[i]=sc.nextLine();
        x=true;
        }
      }
      if(x==false)
      {
        System.out.print("\nTen ko ton tai trong danh ba");
      }
   }
    public void  SearchbyName(String arrTen[],String arrSDT[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("\nNhap ten lien he can tim ");
      String ten=sc.nextLine();
      boolean x=false;
      for(int i=0;i<arrTen.length;i++)
      {
        if(arrTen[i].equals(ten))
        {
        System.out.print("\nSdt cua "+ten+" la:"+arrSDT[i]);
        x=true;
        }
      }
      if(x==false)
      {
        System.out.print("\nTen ko ton tai trong danh ba");
      }
   }
}  


