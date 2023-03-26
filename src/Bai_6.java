import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap text can dao nguoc");
        String text = scan.nextLine();
        stringBuffer1(text);
        stringBuffer2(text);

    }
    public  static  void stringBuffer1(String text){
        StringBuilder stringBuffer = new StringBuilder(text);
        System.out.println("Dao Nguoc chu: " + stringBuffer.reverse().toString());
    }
    public static void  stringBuffer2(String text){
        String [] arr = text.split("");
        String stringArr2 = "";
        for (int i = arr.length-1; i >=0; i--){
            stringArr2 = stringArr2 + arr[i];
        }
        System.out.println("Dao Nguoc chu: " + stringArr2);
    }
}
