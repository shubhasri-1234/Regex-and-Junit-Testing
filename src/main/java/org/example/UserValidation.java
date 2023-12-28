package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validate First Name
        String firstName = getValidInput(scanner, "Enter your first name: ", "^[A-Z][a-zA-Z]{2,}$");

        // Validate Last Name
        String lastName = getValidInput(scanner, "Enter your last name: ", "^[A-Z][a-zA-Z]{2,}$");

        // Validate Email
        String email = getValidInput(scanner, "Enter your email: ", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        // Validate Mobile Number
        String mobileNumber = getValidInput(scanner, "Enter your mobile number: ", "^\\d{2} \\d{10}$");

        // Validate Password
        String password = getValidPassword(scanner);

        // Display validated information
        System.out.println("Validated Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Password: " + password);
        
        scanner.close();
    }

    private static String getValidInput(Scanner scanner, String prompt, String regex) {
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine();
        } while (!isValidInput(input, regex));
        return input;
    }

    public static boolean isValidInput(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static String getValidPassword(Scanner scanner) {
        String password;
        do {
            System.out.println("Enter your password: ");
            password = scanner.nextLine();
        } while (!isValidPassword(password));
        return password;
    }

    public static boolean isValidPassword(String password) {
          // Rule 1: Minimum 8 characters
          if (password.length() < 8) {
            return false;
        }

        // Rule 2: Should have at least 1 Upper Case
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Matcher uppercaseMatcher = uppercasePattern.matcher(password);
        if (!uppercaseMatcher.find()) {
            return false;
        }

        // Rule 3: Should have at least 1 numeric number
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        // Rule 4: Has exactly 1 Special Character
        Pattern specialCharPattern = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]");
        Matcher specialCharMatcher = specialCharPattern.matcher(password);
        int specialCharCount = 0;
        while (specialCharMatcher.find()) {
            specialCharCount++;
        }
        if (specialCharCount != 1) {
            return false;
        }

        // All rules passed
        return true;
    }
}


