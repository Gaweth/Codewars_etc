package OOP.Zadanie2;

public class Staff extends Person{
    String specialization;
    double payment;


    public Staff(String name, String adress,String specialization, double payment) {
        super(name, adress);
        this.specialization = specialization;
        this.payment = payment;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", specialization='" + specialization + '\'' +
                ", payment=" + payment +
                '}';
    }
}
