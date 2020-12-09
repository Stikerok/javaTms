package com;

public interface CountTabel {
    int cuounChar(String text, char index);

    int countWordsStartWithChar(String string, char index);

    int countWordsStartAndEndWithChar(String string, char index, char index2);
}
