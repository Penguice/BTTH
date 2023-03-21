import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String chuoi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap noi dung chuoi: ");
        chuoi=sc.nextLine();
        if(chuoi.length()>80){
            System.out.println("Chuoi vuot qua 80 ky tu");
        }else{
        char kytu;
        int count=0;
        System.out.println("NHap ky tu: ");
        kytu=sc.next().charAt(0);
        if(chuoi.length()>80){
            System.out.println("Chuoi vuot qua 80 ky tu");
        }else{
        for(int i=0;i<chuoi.length();i++){
            if(chuoi.charAt(i)==kytu){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua "+kytu+" la "+count);
        }
        sc.close();
    }
}
}
