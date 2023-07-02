import java.awt.event.TextEvent;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println(enterStroke());
    }

    public static String  enterStroke(){
        Scanner sc = new Scanner(System.in);
        String stroke;
        System.out.println("Введите текст: ");
        stroke = sc.nextLine();
        if(stroke.isEmpty()) {
            System.out.println("Строка не может быть пустой");
            stroke = enterStroke();
        }
        return stroke;
    }
}
