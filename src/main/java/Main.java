public class Main {

    public static void main(String args[]) {
        System.out.println(calculateSum("12345"));
    }

    public static Integer calculateSum(String input) throws NumberFormatException {
        int value;

        try {
            value = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw e;
        }

        int acum = 0;
        int temp = value;
        while (temp != 0) {
            acum += temp % 10;
            temp /= 10;
        }

        return acum;
    }
}


