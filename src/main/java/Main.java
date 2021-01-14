import java.util.Scanner;

public class Main {

    //https://itvdn.com/ru/blog/article/test-java-20

    public static void main(String[] args) {

        int number, x, y = 0, z = 1;

        Scanner scannerQ = new Scanner(System.in);
        System.out.println("Введите количество значений");

        number = scannerQ.nextInt();
        System.out.println("Серия чисел Фибоначчи: ");

        for (int i = 0; i <= number; i++) {

            x = y;
            y = z;
            z = x + y;

            System.out.println(x + "");    // если вы хотите вывести в текущей строке - используйте print()

        }

    }

}


