import java.util.Scanner;

public class Bai_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    public static void nhapSo(Scanner scan){
        int soBiMat = (int) (Math.random()*99+1);
        System.out.println(soBiMat);
        int nhapSo;
        boolean flag = true;
        do {
            System.out.print("Nhap vao so bat ki: ");
            nhapSo = Integer.parseInt(scan.nextLine());
            if(nhapSo>soBiMat) {
                System.out.println("Ban dang nhap so lon hon so Bi Mat");
            }else if(nhapSo<soBiMat) {
                System.out.println("Ban dang nhap so nho hon so Bi Mat");
            }else {
                flag=false;
            }
        }while(flag);
        System.out.println("BIGNER");
    }
}
