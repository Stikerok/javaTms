package com;

public class Text implements CountTabel {


    @Override
    public int countChar(String text, char index) {
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

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == ' ' || symbol == ',' || symbol == '.') {
                if (builder.length() > 1) {

                    if (builder.charAt(0) == index) {
                        count++;
                    }
                }
                builder.setLength(0);
            } else {
                builder.append(string.charAt(i));
            }
        }

        return count;
    }

    @Override
    public int countWordsStartAndEndWithChar(String string, char index, char index2) {
        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol == ' ' || symbol == ',' || symbol == '.') {
                if (builder.length() > 1) {
                    if (builder.charAt(0) == index && builder.charAt(builder.length() - 1) == index2) {
                        count++;
                    }
                }
                builder.setLength(0);
            } else {
                builder.append(string.charAt(i));

            }
        }
        return count;
    }
}
