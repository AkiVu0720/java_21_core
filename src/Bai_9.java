import javax.swing.*;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Bai_9 {
    static  boolean flag = true;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        compare(scan);
        compare(scan);


    }
    // Kiem tra nhap vao co phai la kieu so khong.
    public static boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
    public static String input(Scanner scan){
        return scan.nextLine();
    }
    public static void compare(Scanner scan){
        flag = false;
        String string_one;
        String string_two;
        int number_1;
        int number_2;
        // Kiem tra so 1
        do {
            System.out.println("Nhap so thu 1 (0-99): ");
            string_one = input(scan);
            if (isNumeric(string_one)){
                number_1 = Integer.parseInt((string_one));
                if(number_1>10 && number_1<99) {
                    flag = true;
                }
            }else {
                System.out.println("Yêu cầu nhập kiểu dữ liệu số: ");
            }
        }while (!flag);
        flag = false;
        // Kiem tra so 2
        do {
            System.out.println("Nhap so thu 2 (0-99): ");
            string_two = input(scan);

            if (isNumeric(string_two)){
                number_2 = Integer.parseInt((string_two));
                if(number_2>10 && number_2<99) {
                    flag = true;
                }
            }else {
                System.out.println("Yêu cầu nhập kiểu dữ liệu số: ");
            }
        }while (!flag);
        // Tach phan tu cua so 1 ra thanh 2 chuoi moi
        String number_id_one = string_one.substring(0,1);
        String number_id_two = string_one.substring(1);
       // Kiem tra
        if(string_two.contains(number_id_one) || string_two.contains(number_id_two)){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }


    }

}
