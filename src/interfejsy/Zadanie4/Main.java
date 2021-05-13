package interfejsy.Zadanie4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Kuba", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user1.setLastName("Johnm", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });

        user1.setAge(25, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >0 && input < 150;
            }
        });

        user1.setLogin("login", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });

        user1.setPassword("pa!ss", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });

        System.out.println(user1);
    }
}
