package Main;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println(stack.getMaximumStackSize());

        System.out.println();
        System.out.println("===============");
        System.out.println();

        stack.Push(0);
        stack.Push(1);
        stack.Push(2);



        System.out.println(stack.getSize());


        System.out.println();
        System.out.println("===============");
        System.out.println();

        stack.display();

        stack.reverse();

        stack.display();

    }
}
