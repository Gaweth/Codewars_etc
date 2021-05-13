package Main;

public class Finonacii {
    public static void main(String[] args) {
        System.out.println(fibonacii(8));

    }
    private static int fibonacii(int fib){
        if (fib==0){
            return 0;
        }
       else if (fib==1){
            return 1;
        }

        else return fibonacii(fib-1) + fibonacii(fib-2);
    }
}
