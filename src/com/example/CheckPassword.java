package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {

    public static boolean checkPassword(String pwd) {

        Pattern r = Pattern.compile("(^\\d{4}$|^\\d{6}$)");
        Matcher m = r.matcher(pwd);
        return m.find();
    }

    public static void main(String[] args) {

        System.out.println(checkPassword("121317"));
        System.out.println(checkPassword(" 1234"));
        System.out.println(checkPassword(""));
        System.out.println(checkPassword("4123"));
        System.out.println(checkPassword("41234"));
        System.out.println(checkPassword("4wq34"));
    }
}
