package OOP.zadanie3;

abstract public class Shape {
    String color;
    boolean isFill;

    public Shape() {
        this.color = "unknown";
        this.isFill = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return isFill;
    }

    public void setFill(boolean fill) {
        isFill = fill;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", isFill=" + isFill +
                '}';
    }

    public abstract double getArea();

    public abstract double getPerimater();

    }


