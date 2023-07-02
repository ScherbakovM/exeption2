import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Float digit = enterFloat();
        System.out.println(digit);
    }

    public static float enterFloat() {
        Float digit = null;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите дробное число (12,22) : ");
            digit = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("Ошибка ввода " + e + " повторите ввод");
            digit = enterFloat();
        }
        return digit;
    }
}