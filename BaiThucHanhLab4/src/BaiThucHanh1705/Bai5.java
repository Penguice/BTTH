package BaiThucHanh1705;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai5 {
     String maSV;
     String hoTen;
     String lop;

    public Bai5(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Map<String, Bai5> danhSachSinhVien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("MSV: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            Bai5 sinhVien = new Bai5(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sinhVien);
        }

       
        System.out.print("Nhap ten lop: ");
        String tenLop = scanner.nextLine();

        System.out.println("sinh vien thuoc lop " + tenLop + ":");
        for (Bai5 sinhVien : danhSachSinhVien.values()) {
            if (sinhVien.getLop().equals(tenLop)) {
                System.out.println("MSV: " + sinhVien.getMaSV());
                System.out.println("Ho ten: " + sinhVien.getHoTen());
                System.out.println("Lop: " + sinhVien.getLop());
                System.out.println();
            }
        }

        
        System.out.print("MSV la: ");
        String maSV = scanner.nextLine();

        Bai5 sinhVien = danhSachSinhVien.get(maSV);
        if (sinhVien != null) {
            System.out.println("Ho ten la: " + sinhVien.getHoTen());
            System.out.println("Lop: " + sinhVien.getLop());
        } else {
            System.out.println("Khong co " + maSV);
        }
    }
}