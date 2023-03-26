import java.util.Scanner;

public class Bai_16 {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        year = nhap(scan);
        boolean isLeap = false;
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else
                    isLeap = false;
                }else
                    isLeap = true;
            }else {
                isLeap = false;
            }
        if(isLeap==true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");

    }
    public static int nhap(Scanner scan) {
        int n;
        do {
            System.out.println("Nhập năm bạn cần kiểm tra ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1);
        return n;
    }
}
