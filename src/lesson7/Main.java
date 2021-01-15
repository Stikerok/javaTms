package lesson7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sentence = "sads lovol sdfsd";

        String[] subStr = sentence.split(" ");
        for (String str : subStr) {
            StringBuilder builder = new StringBuilder(str);
            String str1 = builder.reverse().toString();
                System.out.println(str);
                System.out.println(str1);
            System.out.println(str.equals(str1));
            System.out.println("===========================================");

        }
    }
}
