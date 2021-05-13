package Main;

public class moveToRight {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3};
        int[] result = new int[tab.length];


        for (int i = 0; i < tab.length; i++) {
            if (i == 0){
                result[result.length - 1] = tab[0];
            }
            else
               result[i - 1] = tab[i];
        }

        System.out.println("====");
        for (int tab2:result) {
            System.out.println(tab2);

        }
    }


}
