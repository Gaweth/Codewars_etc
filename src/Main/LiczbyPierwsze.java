package Main;

public class LiczbyPierwsze {
    public static void main(String[] args) {

        System.out.println(czyLiczbaPierwsza(1502));

    }

    protected static boolean czyLiczbaPierwsza(int n) {

        int check = 0;
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                check++;
            }
            if (check > 2) {
                return false;
            }
        }
        return true;

    }
}

