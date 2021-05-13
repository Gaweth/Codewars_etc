package OOP.zadanie3;

public class Rectangle extends Shape {
    double width;
    double lenght;

    public Rectangle(double width, double lenght) {
        this.color = "uknown";
        this.isFill = false;
        this.width = width;
        this.lenght = width;
    }

    public Rectangle(String color, boolean isFill, double width, double lenght) {
        this.color = color;
        this.isFill = isFill;
        this.width = width;
        this.lenght = lenght;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public double getArea(){
        return width*lenght;
    }
    @Override
    public double getPerimater(){
        return (2*width)+(2*lenght);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", isFill=" + isFill +
                '}';
    }



}
