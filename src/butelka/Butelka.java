package butelka;

public class Butelka {

    double pojemnosc;


    public Butelka() {
        this.pojemnosc = pojemnosc;
    }

    public Butelka(double ileLitrow) {
        this.pojemnosc = ileLitrow;
    }

    public double wlej(double ilosc) {
        return this.pojemnosc+=ilosc;
    }

    boolean wylej(double ilosc)
    {
        if (ilosc < pojemnosc)
            this.pojemnosc -= ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelac)
    {
        if (this.wylej(ilosc))
        {
            gdziePrzelac.wlej(ilosc);
        }
        else
            System.out.println("Za mało");
    }




    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[3];

        butelka[0] = new Butelka(2);
        butelka[1] = new Butelka(5);
        butelka[2] = new Butelka(10);

        }
    }

