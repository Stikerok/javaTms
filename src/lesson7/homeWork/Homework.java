package lesson7.homeWork;

import java.io.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        try (FileReader inFile = new FileReader("Input.txt");
             FileWriter outFile = new FileWriter("Output.txt")) {
            int symbol;
            StringBuilder builder = new StringBuilder();
            while (((symbol = inFile.read()) != -1)) {
                String str = Character.toString((char) symbol);
                if (str.equals(".")) {
                    int count = TextFormater.countWord(builder.toString().trim());
                    if (TextFormater.checkPolindrom(builder.toString().trim()) ||
                            (count >= 3 && count <= 5)) {
                        outFile.write(builder.toString().trim() + ". ");
                    }
                    builder.setLength(0);
                    continue;
                }
                builder.append(str);
            }
        }
    }
}

