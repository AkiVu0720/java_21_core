import java.util.Scanner;

public class Bai_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int[] arr = nhapMang(n,scan);
        xuatMang(arr);
        System.out.println("\nCác phẩn tử chẵn: ");
        phanTuChan(arr);
        System.out.println("\nCác phẩn tử lẻ: ");
        phanTuLe(arr);
    }
    public static int nhapN(Scanner scan) {
        int n;
        do {
            System.out.print("Vui lòng nhập vào số phẩn tử mảng: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 2);
        return n;
    }
    public static int[] nhapMang(int n, Scanner scan) {
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scan.nextInt();
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println("\nDanh sách các phẩn tử: ");
        for (int item : a) {
            System.out.print(item + "\t");
        }
    }
    public static int demPhanTuChan(int a[]) {
        int dem = 0;
        for (int pt : a) {
            if (pt%2==0) {
                dem++;
            }
        }
        return dem;
    }
    public static int demPhanTuLe(int a[]) {
        int dem = 0;
        for (int pt : a) {
            if (pt%2 != 0) {
                dem++;
            }
        }
        return dem;
    }
    public static void phanTuChan(int arr[]) {
        int dem = demPhanTuChan(arr) ;

        if (dem > 0) {
            int arrChan [] = new int[dem];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arrChan[j++] = arr[i];
                }
            }
            xuatMang(arrChan);
        } else {
            System.out.println("Khong co phan tu chan");
        }
    }
    public static void phanTuLe(int arr[]) {
        int dem = demPhanTuLe(arr) ;
        if (dem > 0) {
            int arrLe [] = new int[ dem];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arrLe[j++] = arr[i];
                }
            }
            xuatMang(arrLe);
        } else {
            System.out.println("Khong co phan tu le");
        }
    }
}
