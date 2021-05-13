package Main;

public class findNextSquare {
    public static void main(String[] args) {
        System.out.println(NumberFun.findNextSquare(625));
    }


    public static class NumberFun {
        public static long findNextSquare(long sq) {

            long root;
            long nextRoot;
            if (Math.sqrt(sq)%1 == 0){
                root = (long) Math.sqrt(sq);
                nextRoot = root+1;
            }
            else {return -1;}
            return nextRoot*nextRoot;

        }

    }
}