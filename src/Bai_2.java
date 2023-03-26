import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Bai_2 {
    static boolean flag = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so dang nhi phan can chuyen sang thap phan: ");
        int NhapSoNP = Integer.parseInt(scan.nextLine());
        NhiPhanSangThapPhan(NhapSoNP);
        System.out.println("Nhap so dang Thap phan can chuyen sang Nhi phan: ");
        int NhapSoTP = Integer.parseInt(scan.nextLine());
        ThapPhanSangNhiPhan(NhapSoTP);

    }

    public static void NhiPhanSangThapPhan(int Number) {
        flag = true;
        int soBanDau = Number;
        int soThapPhan = 0;
        int index = 0;
        while (flag) {
            if (Number == 0) {
                flag = false;
            } else {
                int chiaSo = Number % 10;
                soThapPhan += index * Math.pow(2, index);
                Number /= 10;
                index++;
            }
        }
        System.out.println("So " + soBanDau + " chuyen sang thap phan la: " + soThapPhan);
    }

    public static void ThapPhanSangNhiPhan(int Number) {
        if (Number < 0) {
            System.out.println(" ");
            return;
        }
        int soBanDau = Number;
        //Cach 1:
            System.out.println("So " + soBanDau + " chuyen sang thap phan la: " +Integer.toBinaryString(soBanDau));
        //Cach 2:
        StringBuilder soNhiPhan = new StringBuilder();
        while (Number > 0) {
            soNhiPhan.append(Number % 2);
            Number /= 2;
        }
        System.out.println("So " + soBanDau + " chuyen sang thap phan la: " + soNhiPhan.reverse());

    }

}
