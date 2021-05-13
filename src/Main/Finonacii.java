package Main;

public class Finonacii {
    public static void main(String[] args) {

        Finonacii finonacii = new Finonacii();
        //   System.out.println(finonacii.fibonacii(79));
        System.out.println(sumAll(125));
        System.out.println(pali("kajak"));
        System.out.println(pali("fhgfgh"));
        System.out.println(pali("oko w oko"));
        System.out.println(pali("okO w oko"));
        System.out.println();

        System.out.println("===============");
        System.out.println();
        System.out.println(paliStringBuilder("oko"));
        System.out.println(paliStringBuilder("oko w oko"));
        System.out.println(paliStringBuilder("ogdfgdko"));
    }

    private long fibonacii(long fib) {

        if (fib == 0) {
            return 0;
        } else if (fib == 1) {
            return 1;
        } else return fibonacii(fib - 1) + fibonacii(fib - 2);
    }

    public static int sumAll(int num) {


        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;

    }

    public static String pali(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - i - 1)) {
                return "jest";
            }

        } return "nie";
    }

    public static boolean paliStringBuilder(String word){

        StringBuilder sb = new StringBuilder(word);

        if (word.equals(sb.reverse().toString()))
            return true;

         return false;
    }
}
