package OOP.Zadanie2;

public class Student extends Person {
    String type;
    Double yearOFStudies;
    double cost;

    public Student(String name, String adress, String type, Double yearOFStudies, double cost) {
        super(name, adress);
        this.type = type;
        this.yearOFStudies = yearOFStudies;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getYearOFStudies() {
        return yearOFStudies;
    }

    public void setYearOFStudies(Double yearOFStudies) {
        this.yearOFStudies = yearOFStudies;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", type='" + type + '\'' +
                ", yearOFStudies=" + yearOFStudies +
                ", cost=" + cost +
                '}';
    }
}
