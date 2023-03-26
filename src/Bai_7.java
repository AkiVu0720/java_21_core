import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can tim cac uoc so: ");
        int number = Integer.parseInt(scan.nextLine());
        int index =1;
        System.out.println("Cac uoc so: ");
        while (index <= number){
            if (number % index == 0){
                System.out.print(index +" ");

            }
            index++;
        }
    }
}
