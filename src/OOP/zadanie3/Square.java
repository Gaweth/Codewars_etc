package OOP.zadanie3;

public class Square extends Rectangle{



    public Square(String color, boolean isFill, double width, double lenght) {
        super(color, isFill, width, lenght);
    }



    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLenght(width);
    }



    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
        super.setLenght(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", isFill=" + isFill +
                '}';
    }
}
