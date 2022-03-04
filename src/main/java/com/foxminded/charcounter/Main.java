package com.foxminded.charcounter;

public class Main {

    public static void main(String[] args) {

        CharCounter createTable = new CharCounter();
        String getInputText;
        while (true) {
            getInputText = InputText.getString();
            if (getInputText.equals("q")) {
                System.out.println("Quit from programm");
                break;
            } else {
                createTable.getUniqueChars(getInputText);
            }
        }
    }

}

