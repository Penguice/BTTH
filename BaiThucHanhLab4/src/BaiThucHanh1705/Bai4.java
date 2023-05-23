package BaiThucHanh1705;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bai4{
    public static void main(String[] args) {
        HashSet<String> aHashSet=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Nhap loai trai cay vao Set va enter de stop :");
            String t=sc.nextLine(); 
            aHashSet.add(t);
            if(t.equals(""))
            break; } 
            aHashSet.remove("");
       System.out.println("danh sach trai cay vua nhap");
       System.out.println(aHashSet);
       System.out.println("nhap ten can tim");
       String b=sc.nextLine();
       if(aHashSet.contains(b)){
        System.out.println("co ten trong danh sach ");}
        else{
            System.out.println("ko co ten trong danh sach ");
        }
        System.out.println("nhap ten can xoa");
       String d=sc.nextLine();
       if(aHashSet.contains(d)){
        aHashSet.remove(d);
         System.out.println("Sau khi xoa:");
         System.out.println(aHashSet);}
        else{
            System.out.println("ko co ten trong danh sach ");
        }
        ArrayList<String> bList= new ArrayList<>();
        while(true){
            System.out.println("Nhap loai trai cay vào list va enter de stop :");
            String g=sc.nextLine(); 
            bList.add(g);
            if(g.equals(""))
            break; } 
            System.out.println("day list");
            for (String z:bList){
                System.out.println(z+"\t");}
        for (String m:bList){
            if(!aHashSet.contains(m)){
                aHashSet.add(m);
            }
        }
        System.out.println("Set vua cap nhat thong tin tu list");
        Iterator<String> iterator = aHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int i=0;i<bList.size();i++){
            if(aHashSet.contains(bList.get(i))){
                aHashSet.remove(bList.get(i));
            }
        }
        System.out.println("Sau khi xoa tt tu list");
       System.out.println(aHashSet);
     }
    }
