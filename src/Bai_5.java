import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Nhap toa do x1 diem A ");
        byte x1 = Byte.parseByte(scan.nextLine());
        System.out.println(" Nhap toa do y1 diem A ");
        byte y1 = Byte.parseByte(scan.nextLine());
        System.out.println(" Nhap toa do x2 diem B ");
        byte x2 = Byte.parseByte(scan.nextLine());
        System.out.println(" Nhap toa do y2 diem B ");
        byte y2 = Byte.parseByte(scan.nextLine());

        double binhPhuongX = Math.pow((x2-x1),2);
        double binhPhuongY = Math.pow((y2-y1),2);
        double chieuDai = Math.sqrt((binhPhuongX+binhPhuongY));
        System.out.format(" Chieu Dai doan AB la: %.2f ", chieuDai);


    }
}
