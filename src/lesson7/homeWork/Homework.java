package lesson7.homeWork;

import java.io.*;

public class Homework {
    public static void main(String[] args) throws IOException {
        try (FileReader inFile = new FileReader("Input.txt");
             BufferedReader blackList = new BufferedReader(new FileReader("blacklist.txt"))) {
            int count = 0;
            int symbol;
            StringBuilder builder = new StringBuilder();
            String[] blackWord = blackList.readLine().split(" ");
            while (((symbol = inFile.read()) != -1)) {
                String str = Character.toString((char) symbol);
                if (str.equals(".")) {
                    for (String word: blackWord) {
                        count += TextFormater.censorText(builder.toString().trim(), word);
                    }
                    builder.setLength(0);
                } else {
                    builder.append((char) symbol);
                }
            }
            if (count == 0) {
                System.out.println("Успешно прошел цензуру!");
            } else {
                System.out.println(count + " предложения не прошли цензуру");
            }
        }
    }
}
