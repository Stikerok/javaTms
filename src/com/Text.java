package com;

public class Text implements CountTabel {


    @Override
    public int cuounChar(String text, char index) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (index == text.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countWordsStartWithChar(String string, char index) {
        int count = 0;

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < string.length(); i++) {
            char a = string.charAt(i);
            if (a != ' ' || a != '.' || a != ',') {
                builder.append(string.charAt(i));
            } else {
                if (builder.charAt(0) == index) {
                    builder.setLength(0);
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int countWordsStartAndEndWithChar(String string, char index, char index2) {
        int count = 0;

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < string.length(); i++) {
            char a = string.charAt(i);
            if (a != ' ' || a != '.' || a != ',') {
                builder.append(string.charAt(i));
            } else {
                if (builder.charAt(0) == index) {
                    builder.setLength(0);
                    count++;
                }
            }
        }
        return count;
    }
}
