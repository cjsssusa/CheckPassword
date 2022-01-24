package com.example;

public class CheckPassword {

    public static boolean checkPassword(String pwd) {

        int sl = pwd.length();
        if (sl < 4 || sl > 6) return false;
        for (int i = 0; i < sl; i++) {
            if (Character.isDigit(pwd.charAt(i)) ) {
                ;
            } else if(Character.isSpaceChar(pwd.charAt(i))) {
                return false;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        System.out.println(checkPassword("121317"));
//        System.out.println(checkPassword(" 1234"));
        System.out.println(checkPassword("89abc1"));
    }
}
