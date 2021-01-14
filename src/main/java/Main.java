import java.util.Scanner;

public class Main {

    //https://itvdn.com/ru/blog/article/test-java-20

    public static void main(String[] args) {

        int temp, number;
        boolean numberIsPrime = true;

        Scanner scannerQ = new Scanner(System.in);
        number = scannerQ.nextInt();
        scannerQ.close();

        for (int x = 2; x <= number / 2; x++) {
            int tempNumber = number % x;

            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }

        if (numberIsPrime)
            System.out.println(number + " число является простым");

        else
            System.out.println(number + " число не является простым");

    }

}


