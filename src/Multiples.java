public class Multiples {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (i < 10) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3) {

                x += 1;

            } else if (divisibleBy5) {

                x += 1;

            }
            i++;
        }

        System.out.println(x);
    }
}
