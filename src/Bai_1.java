import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j;
        System.out.println(" Nhap vao chieu Ngang cua la co:");
        int cNgang = Integer.parseInt(scan.nextLine());
        System.out.println(" Nhap vao chieu Doc cua la co:");
        int cDoc = Integer.parseInt(scan.nextLine());

        for (i = 1; i <= cDoc; i++) {
            for (j = 1; j <= cNgang; j++) {
                if (i <= (2 * cDoc / 3) + 1 && j <= (cNgang / 4) + 1) {
                    if (i % 2 == 0) {
                        System.out.print("  *");
                    }else
                        System.out.print("*  ");
                    } else {
                        System.out.print("  =");
                    }
                }
                System.out.println("\n");
            }
        }

    }

