import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Karaoke {
    static final int TIEN_GIO = 30;
    static final int GIO_MO_CUA = 9;
    static final int GIO_MO_DONG = 24;
    static final byte SO_GIO_CO_DINH = 3;
    static final double TIEN_GIO_UU_DAI = TIEN_GIO * 0.3;
    static final byte NUA_GIO_HAT = 30;
    static final byte TIEN_NUOC_KHOANG = 10;
    static final byte TIEN_BIA = 20;
    static final int KHUYEN_MAI = 20;
    static boolean flag = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tinhTienHat(scan);
    }

    public static void tinhTienHat(Scanner scan) {
        int startH = 0;
        int startM = 0;
        int stopH = 0;
        int stopM = 0;
        do {
            int n;
            do {
                System.out.println("Nhap thoi gian vao: (0-23)(0-60)");
                startH = Integer.parseInt(scan.nextLine());
                startM = Integer.parseInt(scan.nextLine());
            } while (startH > 24 || startH < 0 || startM < 0 || startM > 60);
            if (startH < GIO_MO_CUA) {
                System.out.println("Quan Chua Mo Cua");
            } else {
                do {
                    System.out.println("Nhap thoi gian ra: (0-23)(0-60)");
                    stopH = Integer.parseInt(scan.nextLine());
                    stopM = Integer.parseInt(scan.nextLine());
                } while (stopH > 24 || stopH < 0 || stopM < 0 || stopM > 60);
                flag = false;
            }
        } while (flag);
        LocalTime timeStart = LocalTime.of(startH, startM);
        LocalTime timeStop = LocalTime.of(stopH, stopM);
        long timeHours = ChronoUnit.HOURS.between(timeStart, timeStop);
        long timeMinutes = ChronoUnit.MINUTES.between(timeStart, timeStop);

        double tienHat = tienPhongHat(timeHours, timeMinutes);
        double tienNuoc = tinhTienDoUong(scan);
        double tongTien = tinhTien(tienHat, tienNuoc);

        inChiTiet(scan, startH, startM, stopH, stopM, timeHours, timeMinutes, tienHat, tienNuoc, tongTien);
    }

    public static double tienHat3HSau(long timeHours, long timeMinutes) {
        double tienHat = 0;
        double soPhut = (timeMinutes - (timeHours * 60));
        tienHat = ((timeHours - SO_GIO_CO_DINH) * TIEN_GIO_UU_DAI);
        if (soPhut > NUA_GIO_HAT) {
            tienHat += TIEN_GIO_UU_DAI;
        }
        return tienHat;
    }

    public static double tienPhongHat(long timeHours, long timeMinutes) {
        double tienHat = 0;
        double soPhut = (timeMinutes - (timeHours * 60));
        if (timeHours == 0) {
            tienHat = TIEN_GIO;
        } else if (timeHours <= 3) {
            tienHat = timeHours * TIEN_GIO;
            if (soPhut > NUA_GIO_HAT) {
                tienHat += TIEN_GIO;
            }
        } else {
            tienHat = (SO_GIO_CO_DINH * TIEN_GIO + (timeHours - SO_GIO_CO_DINH) * TIEN_GIO_UU_DAI);
            if (soPhut > NUA_GIO_HAT) {
                tienHat += TIEN_GIO_UU_DAI;
            }
        }
        return tienHat;
    }

    public static double tinhTienDoUong(Scanner scan) {
        flag = true;
        int soLuong = 0;
        double tienDoUong = 0;
        do {
            System.out.println("Vui long lua chon");
            System.out.println("1. Bia");
            System.out.println("2. Nuoc Khoang");
            System.out.println("0. Thoat");
            int loai = Integer.parseInt(scan.nextLine());
            switch (loai) {
                case 1:
                    soLuong = soLuong(scan);
                    tienDoUong += soLuong * TIEN_BIA;
                    break;
                case 2:
                    soLuong = soLuong(scan);
                    tienDoUong += soLuong * TIEN_NUOC_KHOANG;
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui long lua chon lai");
            }
        } while (flag);
        return tienDoUong;
    }

    public static int soLuong(Scanner scan) {
        int soLuong;
        System.out.print("Nhap So Luong: ");
        soLuong = Integer.parseInt(scan.nextLine());
        return soLuong;
    }

    public static double tinhTien(double tienHat, double tienNuoc) {
        double tinhTien = tienHat + tienNuoc;
        return tinhTien;
    }

    public static boolean khuyenMai(int startH) {
        if (startH >= 9 && startH <= 17) {
            return true;
        } else {
            return false;
        }
    }

    public static void inChiTiet(Scanner scan, int startH, int startM, int stopH, int stopM, long timeHours, long timeMinutes, double tienHat, double tienNuoc, double tongTien) {
        String text = " Nghin VND";
        System.out.println("=============CHI TIET HOA DON============");
        System.out.println("3H dau: " + TIEN_GIO + text + "/H ");
        System.out.println("Sau 3H dau: " + TIEN_GIO_UU_DAI + text + "/H ");
        System.out.println("Qua 30 phut: Lam tron 1 tieng.");
        System.out.println("Neu vao tu 9h - 17h: Giam 20% tren tong hoa don.");
        System.out.println("CHI TIET" + "\t\t" + "SU DUNG" + "\t\t" + "DON GIA" + "\t\t" + "THANH TIEN");
        System.out.println("Bắt Đầu :" + "\t\t" + startH + ":" + startM);
        System.out.println("Kêt Thúc :" + "\t\t" + stopH + ":" + stopM);
        System.out.println("Thoi gian: " + "\t\t" + timeHours + "h " + (timeMinutes - (timeHours * 60)) + "p");
        if (timeHours > SO_GIO_CO_DINH) {
            System.out.println("3 gio dau:" + "\t\t\t\t" + TIEN_GIO + text + "\t" + SO_GIO_CO_DINH * TIEN_GIO + text);
            System.out.println("Sau 3h dau: " + "\t" + (timeHours - SO_GIO_CO_DINH) + "h" + (timeMinutes - (timeHours * 60)) + "p" + "\t" + TIEN_GIO_UU_DAI + text + "\t" + tienHat3HSau(timeHours, timeMinutes) + text);
        } else {
            System.out.println("Tien Hat: " + "\t\t\t\t\t\t\t\t" + tienHat + text);
        }
        System.out.println("Tien Nuoc: " + "\t\t\t\t\t\t\t\t" + tienNuoc + text);
        System.out.println("Tong Tien: " + "\t\t\t\t\t\t\t\t" + tongTien + text);
        if (khuyenMai(startH)) {
            System.out.println("Khuyen mai: " + "\t\t\t\t" + KHUYEN_MAI + "%" + "\t\t\t" + "-" + tongTien * 0.2 + text);
            System.out.println("Thanh Tien:" + "\t\t\t\t\t\t\t\t" + Math.round(tongTien * 0.8) + text);
        } else {
            System.out.println("Khuyen mai: " + "\t\t\t\t" + "Khong co" + "\t\t" + "0" + text);
            System.out.println("Thanh Tien:" + "\t\t\t\t\t\t\t\t" + Math.round(tongTien) + text);
        }
    }
}