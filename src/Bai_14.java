import java.util.Scanner;
public class Bai_14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int [] arr = taoMang(scanner);
            int [] newArr = new int [arr.length];

            boolean flag;
            int count = 0;
            newArr[0] = arr[0];
            count++;
            for (int i = 1; i < arr.length; i++) {
                flag = false;
                for (int j = 0; j < count; j++) {
                    if (newArr[j] == arr[i]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    newArr[count] = arr[i];
                    count++;
                }
            }
            arr = new int[count];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = newArr[i];
            }
            //In ra kết quả:
            System.out.println("Sau khi loại bỏ những giá trị giống nhau, ta được:");
            for (int i : arr) {
                System.out.print(i);
            }
        }
    public static int[] taoMang(Scanner scan) {
        int n;
        do {
            System.out.println("Nhap n phan tu mang: ");
            n = Integer.parseInt(scan.nextLine());

        } while (n < 1);
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = Integer.parseInt(scan.nextLine());
        }
        return a;
    }



}
