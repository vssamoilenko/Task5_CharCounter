package com.foxminded.charcounter;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {

    public static Map<String, String> cachedResults = new HashMap<>();

    public void getUniqueChars(String input) {

        Map<Character, Integer> resultTable = new HashMap<>();

        if (cachedResults.containsKey(input)) {

            System.out.println("Access cache");
            System.out.println(cachedResults.get(input));

        } else {

            createResultTable(input, resultTable);
            cachedResults.put(input, createPrintString(resultTable));
            System.out.println("Not in cache");
            System.out.println(createPrintString(resultTable));

        }
    }

    private void createResultTable(String input, Map<Character, Integer> resultTable) {

        char[] inputCharArray = input.toCharArray();

        for (char charInput : inputCharArray) {
            if (resultTable.containsKey(charInput)) {
                resultTable.put(charInput, resultTable.get(charInput) + 1);
            } else {
                resultTable.put(charInput, 1);
            }
        }
    }

    private String createPrintString(Map<Character, Integer> resultTable) {

        StringBuilder printString = new StringBuilder();

        for (Character charKey : resultTable.keySet()) {
            printString.append("\"").append(charKey).append("\" - ").append(resultTable.get(charKey)).append("\n");
        }
        return printString.toString();
    }
}
