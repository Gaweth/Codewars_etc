package OOP.Zadanie2;

public class Person {
    String name;
    String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    public Person() {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

