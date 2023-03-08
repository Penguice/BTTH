

import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap x:");
        x = sc.nextInt();
        switch(x){
            case 1: System.out.println("Chu Nhat");
            break;
            case 2: System.out.println("Thu 2");
            break;
            case 3: System.out.println("Thu 3");
            break;
            case 4: System.out.println("Thu 4");
            break;
            case 5: System.out.println("Thu 5");
            break;
            case 6: System.out.println("Thu 6");
            break;
            case 7: System.out.println("Thu 7");
            break;
            default:System.out.println("Khong phai ngay trong tuan");
            break;
        }
        sc.close();
    }
    
}
