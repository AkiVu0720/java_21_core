import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = input(scan);
        veTamGiac(n);


    }
    public static int input(Scanner scan) {
        int n;
        do {
            System.out.println("Nhập n > 0  ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 1 );
        return n;
    }
    public  static void veTamGiac(int n){
        for (int row = 1; row < n+1; row++){
            for (int column = 1; column < row; column++){
                    System.out.print(column);
            }
            System.out.println(row);
        }
    }
}
