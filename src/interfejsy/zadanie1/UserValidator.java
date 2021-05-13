package interfejsy.zadanie1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public String[] validateEmail(String email, String altenativeEmail) {


        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty()) {
                    this.email = "unknown";
                }
                this.email = email;
            }

        }
        Email email11 = new Email(email);
        Email email2 = new Email(altenativeEmail);
        return new String[]{email11.email, email2.email};
    }

    public static final Pattern VALID_EMAIL_ADRESS_REGEX =
            Pattern.compile("^[A-Z0-9,_]",Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
    Matcher matcher = VALID_EMAIL_ADRESS_REGEX.matcher(emailStr);
    return matcher.find();
}
}
