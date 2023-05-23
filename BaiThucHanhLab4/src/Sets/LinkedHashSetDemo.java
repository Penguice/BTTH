package Sets;

import java.util.HashSet;
import java.util.Scanner;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
    HashSet<Student> stHashSet=new HashSet<>(); 
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so nguoi can them vao danh sach: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        Student St = new Student();
        System.out.println("Nhap thong tin nguoi thu " + (i+1) + ":");
        St.nhapthongtin();
        stHashSet.add(St);
    }
    System.out.println("Danh sach nguoi vua nhap la:");
    for (Student St : stHashSet) {
        St.hienthithongtin();
    }
}
}
