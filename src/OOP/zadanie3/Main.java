package OOP.zadanie3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("blue", true, 20);
        Shape rectangle = new Rectangle(10,20);
        Shape rectanlge2 = new Rectangle("blue", true, 10, 30);

        Shape[] shapes = {
                new Circle(),
                new Circle(20) ,
                new Square("blie", true, 10, 20)
        };
        for (Shape shap: shapes) {
            System.out.println(shap);
            System.out.println(shap.getColor());
            System.out.println(shap.getArea());
        }
    }

}
