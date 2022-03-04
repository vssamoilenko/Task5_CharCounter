package com.foxminded.charcounter;

import java.util.Scanner;

public class InputText {

    public static String getString() {
        //6
        String inputString;
        System.out.println("Input the string and press Enter or enter 'q' for quit");
        Scanner myObj = new Scanner(System.in);
        inputString = myObj.nextLine();
        System.out.println("You input string is: '" + inputString + "'");
        return inputString;
    }
}