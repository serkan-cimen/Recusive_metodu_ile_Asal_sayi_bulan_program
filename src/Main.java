import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        if (asalMi(number, number / 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }

    public static boolean asalMi(int number, int dividing) {
        if (dividing == 1) {
            return true;
        } else {
            if (number % dividing == 0) {
                return false;
            } else {
                return asalMi(number, dividing - 1);
            }
        }
    }
}