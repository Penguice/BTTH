import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sohang,socot;
        do{
            System.out.println("Nhap so hang:");
            sohang=sc.nextInt();
        }while(sohang<=0);
        do{
            System.out.println("Nhap so cot:");
            socot=sc.nextInt();
        }while(socot<=0);
        int arrA[][] = new int[sohang][socot];
        for(int i=0;i<sohang;i++){
            for(int j=0;j<socot;j++){
                System.out.printf("A[%d][%d]=",i,j);
                arrA[i][j]=sc.nextInt();    
            }
        }
        int max=arrA[0][0];
        for(int i=0;i<sohang;i++){
            for(int j=0;j<socot;j++){
                if(max<arrA[i][j]){
                    max=arrA[i][j];
                }
            }                
        }
        System.out.println("Phan tu lon nhat trong ma tran la "+max);
        sc.close();
    }
}