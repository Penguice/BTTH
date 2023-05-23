package BaiThucHanh1705;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> aList=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap kick thuoc LinkedList=");
        int x= sc.nextInt();
       for(int i=0;i<x;i++) {
        System.out.printf("nhap so thu %d  ",i+1);
        int a=sc.nextInt();
        aList.add(a);
        }
        System.out.print("Day vua nhap la :");
       for(int i=0;i<x;i++) {
        System.out.print(aList.get(i)+"\t");
       }
       int tong=0;
       int dem=0;
       float tbc=0;
       for(int i=0;i<aList.size();i++){
        if(aList.get(i)%2==0){
            tong=tong+aList.get(i);
            dem++;
            tbc=tong/dem;
        }
       }
       System.out.println("Trung binh cong cua cac so chan la = "+tbc);
    }
}