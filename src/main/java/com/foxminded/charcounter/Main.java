package com.foxminded.charcounter;

public class Main {

    public static void main(String[] args) {
        //aaa
        CharCounter createTable = new CharCounter();
        String getInputText = "";
        while (!getInputText.equals("q")) {
            getInputText = InputText.getString();
            createTable.getUniqueChars(getInputText);
        }
    }

}

