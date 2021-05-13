package interfejsy.Zadanie4;

import javax.swing.*;

public class User {
    String firstName;
    String lastName;
    int age;
    String login;
    String password;

    public User(String firstName, String lastName, int age, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;

    }   public User() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName, Validator<String> validator) {
        if(validator.validate(firstName))
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Validator<String> validator) {
        if (validator.validate(lastName))
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator<Integer> validator) {
        if (validator.validate(age))
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator<String> validator) {
        if (validator.validate(login))
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator<String> validator) {
        if (validator.validate(password))
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
