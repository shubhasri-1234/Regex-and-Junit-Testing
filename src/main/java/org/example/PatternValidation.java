package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValidation {
    public static void main(String[] args) {
        String emailPattern = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";  //example.test, example_test
        Pattern pattern = Pattern.compile(emailPattern);
        String[] email = {
                "user@example.com",
                "user.name@example.com",
                "user_name@example.com",
                "9user@test.in",
                "user@example",
                "@example.com"
        };

        for (String text : email) {
            Matcher matcher = pattern.matcher(text);
            System.out.println(matcher.matches());
        }
    }
}
