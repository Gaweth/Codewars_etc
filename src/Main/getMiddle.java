package Main;

public class getMiddle {
    public static void main(String[] args) {
        System.out.println(Kata.getMiddle("test"));
    }

    class Kata {
        public static String getMiddle(String word) {
            if (word.length() % 2 != 0) {
                return String.valueOf(word.charAt(word.length() / 2));
            }
            else return String.valueOf(word.charAt(word.length() / 2 - 1)) + (word.charAt(word.length() / 2));


        }
    }
}
