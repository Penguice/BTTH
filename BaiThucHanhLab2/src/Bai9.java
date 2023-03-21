import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String chuoi;
        int uccount=0,lccount=0,n=0;
        char kytu;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap noi dung chuoi: ");
        chuoi=sc.nextLine();
        for(int i=0; i<chuoi.length();i++){
            kytu=chuoi.charAt(i);
            if(Character.isUpperCase(kytu)){
                uccount++;
            }
            if(Character.isLowerCase(kytu)){
                lccount++;
            }
            if(Character.isDigit(kytu)){
                n++;
            }
        }
        System.out.println("So chu cai in hoa trong chuoi la "+uccount);
        System.out.println("So chu cai in thuong la "+lccount);
        System.out.println("So cac chu so la "+n);
        sc.close();
    }
    
}
