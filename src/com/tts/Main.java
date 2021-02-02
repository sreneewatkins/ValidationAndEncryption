package com.tts;

import java.util.Scanner;

class Encryptor {

    public static String getEncryptedName(String name) {

        Validator v = new Validator();

        if (v.validate(name)){
            StringBuilder encryptedName = new StringBuilder(name.toLowerCase()).reverse();
            return encryptedName.toString();
        }
        else {
            throw new IllegalArgumentException("Try again with valid name");
        }
    }

}//end Encryptor class


class Validator {

    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        return true;
    }
}//end Validator class

class Solution {

    private static final Scanner inputReader = new Scanner(System.in);

    public static void main(String[] args) {

        String name = inputReader.nextLine();

        try {
            System.out.println(Encryptor.getEncryptedName(name));
        } catch (Exception e){
            System.out.println(e);
        }

    }//end main()

}//end Solution class