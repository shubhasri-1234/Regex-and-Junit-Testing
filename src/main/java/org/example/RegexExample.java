package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*");
        Matcher matcher = pattern.matcher("aaab");
        System.out.println(matcher.matches());

        Pattern pattern1 = Pattern.compile("a{2,5}");
        Matcher matcher1 = pattern1.matcher("aaaaaa");
        System.out.println(matcher1.matches());
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
    }
}
