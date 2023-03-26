import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao 1 so muon tinh Tong: ");
        int number = Integer.parseInt(scan.next());
        int tong=0;
        while (number>0){
           tong += number %10;
           number/=10;
        }
        System.out.println("Tong ca chu so la: "+ tong);
    }
}
