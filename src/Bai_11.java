import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhap(scan);
        double logN = Math.floor((Math.log(n) / Math.log(2)));
        System.out.println("So tu nhien lon nhat nho hon log2" +"("+ n+")");
        System.out.println(logN);
    }
    public  static  int nhap(Scanner scan){
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(scan.nextLine());
        return n;
    }
}
