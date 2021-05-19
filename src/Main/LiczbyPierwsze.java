package Main;

public class LiczbyPierwsze {
    public static void main(String[] args) {

  System.out.println(czyLiczbaPierwsza(3));
  System.out.println(czyLiczbaPierwsza(4));
  System.out.println(czyLiczbaPierwsza(5));
  System.out.println(czyLiczbaPierwsza(6));


    }

    protected static String czyLiczbaPierwsza(int n) {


        int check = 0;
        if (n == 0 || n == 1) {
            return "nie jest";
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                check++;
            }
            if (check > 2) {
                return " nie jest";
            }
        }
        return "jeszcze jak byczq +1";

    }
}

