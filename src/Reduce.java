public class Reduce {
    public static void main(String[] args) {
        int x = 0;
        int i = 2;
        while (i != 0) {

            boolean divisibleBy2 = i % 2 == 0;

            x += 1;

            if (divisibleBy2) {

                i = i / 2;

            } else {

                i -= 1;

            }
            }
        System.out.println(x);
    }
}
