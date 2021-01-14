public class Main {

    //https://itvdn.com/ru/blog/article/test-java-20

    public static void main(String[] args) {

        String st = "Hello";
        int counter = 0;

        char[] charsArray = st.toCharArray();
        System.out.println("Повторяющиеся символы тут:");

        for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {

                if (charsArray[i] == charsArray[j]) {
                    System.out.println(charsArray[j]);
                    counter++;
                    break;
                }
            }

        }

    }
}


