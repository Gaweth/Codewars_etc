package OOP.zadanie3;

public class Circle extends Shape {

    double radius;

    public Circle() {
        this.color = "uknown";
        this.isFill = false;
        this.radius = 1;
    }
    public Circle(double radius) {
        this.color = "uknown";
        this.isFill = false;
        this.radius = radius;
    }

    public Circle(String color, boolean isFill, double radius) {
        this.color = color;
        this.isFill = isFill;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimater() {
        return Math.PI * (radius + radius);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", isFill=" + isFill +
                '}';
    }


}
