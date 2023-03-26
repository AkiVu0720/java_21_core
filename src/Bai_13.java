import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = nhapN(scan);
        int[] arr = nhapMang(n,scan);
        xuatMang(arr);
        menu(scan,arr);


    }
    public  static void menu(Scanner scan, int arr[] ){
        boolean flag = true;
        do {
            System.out.println("\n----=====--- MENU ----=====---");
            System.out.println("1. Gia tri trung binh");
            System.out.println("2. Phan tu lon nhat, nho nhat");
            System.out.println("3. Phần tử âm lớn nhất, nhỏ nhất:");
            System.out.println("4. Phần tử dương lớn nhất, nhỏ nhất");
            System.out.println("5. Phần tủ chẵn và lẻ");
            System.out.println("6. Thêm phần tử");
            System.out.println("7. Xóa phần tử");
            System.out.println("0. Thoat");
            byte chon = scan.nextByte();
            switch (chon){
                case 1:
                    giaTriTrungBinh(arr);
                    break;
                case 2:
                    System.out.println("Phan tu lon nhat trong mang: ");
                    numberMax(arr);
                    System.out.println("\nPhan tu nho nhat trong mang: ");
                    numberMin(arr);
                    break;
                case 3:
                    System.out.println("Phan tu am lon nhat trong mang: ");
                    soAmLonNhat(arr);
                    System.out.println("Phan tu am nho nhat trong mang: ");
                    soAmNhoNhat(arr);
                    break;
                case 4:
                    System.out.println("Phan tu duong lon nhat trong mang: ");
                    soDuongLonNhat(arr);
                    System.out.println("Phan tu duong nho nhat trong mang: ");
                    soDuongNhoNhat(arr);
                    break;
                case 5:
                    System.out.println("Phan tu Chan: ");
                    phanTuChan(arr);
                    System.out.println("\nPhan tu Le: ");
                    phanTuLe(arr);
                    break;
                case 6:
                    int addArr[]= themPhanTu(arr,scan);
                    xuatMang(addArr);
                    break;
                case 7:
                    int deleteArr []= xoaPhanTu(arr,scan);
                    xuatMang(deleteArr);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println(" Vui long chon lai");
            }

        }while (flag);
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
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }

    public static void xuatMang(int a[]) {
        System.out.println("\nDanh sách các phẩn tử: ");
        for (int item : a) {
            System.out.print(item + "\t");
        }
    }
    public static void giaTriTrungBinh(int a[]){
        float tong =0;
        for (int item : a){
            tong+= item;
        }
        System.out.println("\nGiá trị trung bình của mảng : "+ (tong/a.length));
    }


   public  static  void numberMax( int arr[]){
        int indexMax =0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]> arr[indexMax]){
                indexMax = i;
            }
        }
        for (int i = indexMax; i < arr.length; i++){
            if(arr[i]==arr[indexMax]){

                System.out.print(arr[i] + "\t");
            }
        }
   }
    public  static  void numberMin( int arr[]){
        int indexMin =0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]< arr[indexMin]){
                indexMin = i;
            }
        }
        for (int i = indexMin; i < arr.length; i++){
            if(arr[i]==arr[indexMin]){

                System.out.println(arr[i] + "\t");
            }
        }
    }
    public static int timChiSoAmDauTien(int a[]) {
        int index = -1; // chưa tìm thấy
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                index = i;// đã tìm thấy phần tử âm tại chỉ số là i
                break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử âm đầu tiên
            }
        }
        return index;
    }
    public static void soAmLonNhat(int a[]) {
        int index = timChiSoAmDauTien(a);

        if (index == -1) {
            System.out.println("Mảng không có số âm");
        } else {
            for (int i = index + 1; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
                if (a[i] > a[index]  && a[i]<0) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
    public static void soAmNhoNhat(int a[]) {
        int index = timChiSoAmDauTien(a);

        if (index == -1) {
            System.out.println("Mảng không có số âm");
        } else {
            for (int i = index + 1; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
                if (a[i] < a[index]) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
    public static int timChiSoDuongDauTien(int a[]) {
        int index = -1; // chưa tìm thấy
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                index = i;// đã tìm thấy phần tử âm tại chỉ số là i
                break; // thoát khỏi vòng lặp vì đã tìm thấy phần tử âm đầu tiên
            }
        }
        return index;
    }
    public static void soDuongLonNhat(int a[]) {
        int index = timChiSoDuongDauTien(a);

        if (index == -1) {
            System.out.println("Mảng không có số âm");
        } else {
            System.out.println("Các chỉ số tại đó có giá trị bằng " + a[index]);
            for (int i = index + 1; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
                if (a[i] > a[index]) {
                    System.out.println(i + "\t");
                }
            }
        }
    }
    public static void soDuongNhoNhat(int a[]) {
        int index = timChiSoDuongDauTien(a);

        if (index == -1) {
            System.out.println("Mảng không có số âm");
        } else {
            System.out.println("Các chỉ số tại đó có giá trị bằng " + a[index]);
            for (int i = index + 1; i < a.length; i++) { // duyệt từ index là số âm đầu tiên
                if (a[i] < a[index] && a[i]>0) {
                    System.out.println(i + "\t");
                }
            }
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
    public static int[] themPhanTu(int a[], Scanner scan) {
        int nhap;
        do {
            System.out.println("Vui lòng nhập k từ 0 đến " + a.length);
            nhap = scan.nextInt();
        } while (nhap < 0 || nhap > a.length);

        System.out.println("Vui lòng nhập giá trị phần tử cần thêm: x = ");
        int x = scan.nextInt();
        int b[] = new int[a.length + 1];// tạo mảng tạm với kích thước tăng thêm 1
        for (int i = 0; i < b.length; i++) {
            if (i < nhap) {
                b[i] = a[i];
            } else if (i == nhap) {
                b[i] = x;
            } else if(i>nhap) {
                b[i] = a[i-1];
            }
        }
        a = b; //gán mảng tạm về cho mảng gốc
        return a;
    }
    public static int[] xoaPhanTu(int a[], Scanner scan) {
        int k;
        do {
            System.out.println("Vui lòng nhập giá trị phần tử cần xóa: x = ");
            System.out.println("Vui lòng nhập k từ 0 đến " + a.length);
            k = scan.nextInt();
        } while (k < 0 || k > a.length);
        int b[] = new int[a.length - 1];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != k) {
                b[j++] = a[i];
            }
           //gán mảng tạm về cho mảng gốc
        }
        a = b;
        return a;
    }
}
