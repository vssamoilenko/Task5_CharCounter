package com.foxminded.charcounter;

public class Main {
    //add chamge 2 for git
    public static void main(String[] args) {
        //Add change for Git 12234
        CharCounter createTable = new CharCounter();
        String getInputText = "";
        while (!getInputText.equals("q")) {
            getInputText = InputText.getString();
            createTable.getUniqueChars(getInputText);
        }
    }

}

