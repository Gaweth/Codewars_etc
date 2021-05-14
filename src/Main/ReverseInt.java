package Main;

public class ReverseInt {
    public static void main(String[] args) {
        int number = 1235;
        int reverse = 0;

        while (number!=0){


             int num = number % 10;

            reverse = reverse * 10 + num;


            number /=10;

        }
        System.out.println(reverse);

        System.out.println(reverseInt(1325));
    }

    public static String reverseInt(int n){

        return new StringBuilder().append(n).reverse().toString();
    }
}
