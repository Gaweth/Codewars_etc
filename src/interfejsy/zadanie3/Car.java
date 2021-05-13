package interfejsy.zadanie3;

public class Car {
    private String name;
    private String type;
    private Engine engine;


    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngineType(type);


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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine.engineType +
                '}';
    }

    public class Engine {
        String engineType;

        public void setEngineType(String engineType) {
            if (type.equals("economy")){
                this.engineType = "diesel";
            }
            else if (type.equals("luxury")){
                this.engineType = "electric";
            }
            else this.engineType = "petrol";

//        public String engineType;
//
//
//
//        public void setEngineType(String carType) {
//            switch (carType){
//                case "economy" : engineType = "diesel";
//                break;
//
//                case "luxury" :engineType = "electric";
//            }

        }
    }
}
