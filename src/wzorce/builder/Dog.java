package wzorce.builder;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    public Dog(DogBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.age = builder.age;
        this.toys = builder.toys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    public static class DogBuilder{
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public DogBuilder withName(final String name){
            this.name = name;
            return this;

        }
        public DogBuilder withType(final String type){
            this.type = type;
            return this;

        }
        public DogBuilder withAge(final Integer age){
            this.age = age;
            return this;

        }
        public DogBuilder withToys(final List<String> toys) {
            this.toys = toys;
            return this;

        }

        @Override
        public String toString() {
            return "DogBuilder{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", age=" + age +
                    ", toys=" + toys +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<String> aasd = new ArrayList<>();
        aasd.add("zabawka");
        aasd.add("zabawka2");

        String zab1 = "zab1";

        DogBuilder dog1 = new DogBuilder()
                .withName("azor")
                .withAge(5)
                .withType("husky")
                .withToys(aasd);

        System.out.println(dog1);


    }
}
