import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = nhapChuoi(scan);
        ChuHoa(text);
    }
    public static String nhapChuoi(Scanner scan){
        System.out.println("Nhap text can doi chu");
        String text = scan.nextLine();
        return text;
    }
    public  static  void ChuHoa (String text){
        String arr[] = text.split(" ");
        String arr2= " ";
        for(int i = 0; i< arr.length; i++){
            String arr3= arr[i].substring(0,1).toUpperCase()+ arr[i].substring(1);
            arr2 =arr2.concat(arr3)+ " ";
        }
        System.out.println(arr2);
    }
}
