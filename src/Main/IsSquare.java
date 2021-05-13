package Main;

public class IsSquare {
    public static void main(String[] args) {
        System.out.println(Square.isSquare(-1));
        System.out.println(Square.isSquare(0));
        System.out.println(Square.isSquare(219456378));
        System.out.println(Square.isSquare(25));
        System.out.println(Square.isSquare(4));
        System.out.println(Square.isSquare(3));
    }
        public class Square {
            public static boolean isSquare(int n) {
if (Math.sqrt(n) == (int) Math.sqrt(n)){
    return true;
}
             else return false;

            }
    }
}
