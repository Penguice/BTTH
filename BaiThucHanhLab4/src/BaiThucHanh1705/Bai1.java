package BaiThucHanh1705;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> List =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap kick thuoc List=");
        int x= sc.nextInt();
       for(int i=0;i<x;i++) {
        System.out.printf("nhap so thu %d  ",i+1);
        int a=sc.nextInt();
        List.add(a);
       }
       System.out.print("Day vua nhap la :");
       for(int i=0;i<x;i++) {
       System.out.print(List.get(i)+"\t");
       }
       int max=List.get(0);
       for(int i=1;i<List.size();i++){
        if(max<List.get(i)){
            max=List.get(i);
        }
       }
       System.out.println("Max="+max);
    }
}