package Main;

public class Main {
    public static void main(String[] args) {
        System.out.println(pali("kutas"));
        System.out.println(pali("kajak"));
        System.out.println(pali("olo mom oko"));
    }

    public static String pali(String word) {

       return String.valueOf(new StringBuilder(word).reverse().toString().equals(word));


    }
}
