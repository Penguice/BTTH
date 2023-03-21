import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap kich thuoc mang:");
            n=sc.nextInt();
        }while(n<=0);
        int arrA[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Nhap A[%d]: ",i);
            arrA[i]=sc.nextInt();         
        }
        for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arrA[i] > arrA[j]) {	                
	                int temp = arrA[i];
	                arrA[i] = arrA[j];
	                arrA[j] = temp;
	            }
	        }
	    }	    
		for (int i = 0; i < n; i++) {
			System.out.print(arrA[i]+" ");
		}
        sc.close();
    }
    
}
